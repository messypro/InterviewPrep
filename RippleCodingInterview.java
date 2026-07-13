/*
 * Click `Run` to execute the snippet below!
 */


// Given a list of sell orders (Limit Price in USD and Quantity in XRP) and a budget in USD, write a function double calculateXrpQuote(LimitOrders[] orders, double usdAmount).

// Sell Orders : { 10 XRP , 1 USD per XRP}
// Sell Orders : { 20 XRP , 2 USD per XRP}

// Budget : $30
//10XRP+10XRP = 20 XRP

// 1. Clarifications
// currenty is USD only
// Quantity is always XRP
// assume limit orders are 4-5

// 2. Approach
// Goal is - to have max XRP
// Seller orders { [10,1], [20,2], [30,3],[50,5]}, Budget=100
// Budget 
// { [10,1]} Budget=100 balance=90 
// {[10,1], [20,50]} Budget=100 balance=70
// Tets `1- { [10,1], [20,2], [30,3],[50,5]} 
// 10+ 40+ 50 (90)/50



// Valdiations & Test cases
// 1. Empty limit orders
// 2. No Budget
// 3. No XRP proce
// 4. Invalid values of Budget, XRP price, order Quantity
// null, invalids
// 5. Out scope - length of lomit order



import java.io.*;
import java.util.*;

/*
 * To execute Java, please define "static void main" on a class
 * named Solution.
 *
 * If you need more classes, simply define them inline.
 */

class Solution {

  static class LimitOrders{

 int orderQuantity;
 double perXRPPrice;

  LimitOrders(int orderQuantity, double perXRPPrice){
    this.orderQuantity = orderQuantity;
    this.perXRPPrice = perXRPPrice;
  }

  @Override
        public String toString() {
            return String.format("[Qty: %d, Price: %.2f]", orderQuantity, perXRPPrice);
        }

}

public static double calculateXrpQuote(LimitOrders[] orders, double usdAmount){

  double maxXRP=0.0;

  // Valdiations
  if (orders == null || orders.length == 0 || usdAmount <= 0) {
      return 0.0;
  }

  // implementations


  Arrays.sort(orders, Comparator.comparingDouble(o -> o.perXRPPrice));

  for(LimitOrders order : orders){

    if (usdAmount <= 0) {
        break;
    }

    if (order == null || order.orderQuantity <= 0 || order.perXRPPrice <= 0) {
        continue;
    }

    int orderQuantity=order.orderQuantity;
    double perXRPPrice=order.perXRPPrice;

   // how many total orders we can buy 

    double orderPrice = orderQuantity * perXRPPrice;
    
   // 10 * 10
   // 20
   double quantity =0.0;
   if(usdAmount >= orderPrice){
      maxXRP= maxXRP+ orderQuantity;
      usdAmount = usdAmount - orderPrice;
   } else if (usdAmount < orderPrice){
    // partial buy

    // 10/  2 =5
    double possibleXRP = usdAmount/perXRPPrice;

     maxXRP = maxXRP + possibleXRP;
     usdAmount = 0; 
     break;
    
   }

  }

  return maxXRP;

}

  public static void main(String[] args) {
    ArrayList<String> strings = new ArrayList<String>();
    strings.add("Hello, World!");
    strings.add("Welcome to CoderPad.");
    strings.add("This pad is running Java " + Runtime.version().feature());



    double budget = 100;

    //Scenario 1 - Happy Path, sorted by XRP price

    LimitOrders [] orders = {
            new LimitOrders(10, 1.0),
            new LimitOrders(20, 2.0)
        };

    double maxXRPHappyPath = calculateXrpQuote(orders,budget);

    System.out.println("Scenario 1 maxXRPs="+maxXRPHappyPath);

     // Scenario 2 - Infinite Wealth, budget exceeds total market supply
    LimitOrders[] orders2 = {
        new LimitOrders(10, 2.0),
        new LimitOrders(5, 3.0)
    };
    double budget2 = 5000.0;

    double maxXRPSce2 = calculateXrpQuote(orders2, budget2);

    System.out.println("Scenario 2 maxXRPs="+maxXRPSce2);

    // Scenario 3 - Immediate Fractional Buy, budget cannot afford first full order block
    LimitOrders[] orders3 = {
        new LimitOrders(10, 5.0),
        new LimitOrders(100, 10.0)
    };
    double budget3 = 25.0;

    double maxXRPImmediateFraction = calculateXrpQuote(orders3, budget3);

    System.out.println("Scenario 3 maxXRPs=" + maxXRPImmediateFraction); 

    
  }
}
