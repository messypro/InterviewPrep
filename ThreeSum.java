/******************************************************************************

                            Online Java Compiler.
                Code, Compile, Run and Debug java program online.
Write your code in this editor and press "Run" button to execute it.

*******************************************************************************/
import java.util.Arrays;

public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
	    int [] arr = {-1, 0, 1, 2, -1, -4};
	    Arrays.sort(arr); // time complexity nlogn
	    int target = 0;
	    
	    for (int i=0; i< arr.length-1;i++){
	        int currentNum = arr[i];
	        // find other two which sums tp 0-firstNum
	        int twoSumTarget = target - currentNum;
	        
	        int left = i+1, right = arr.length-1;
	        
	        while(left < right){
	            int localSum = arr[left] + arr[right];
	            if(localSum == twoSumTarget){
	                System.out.println("firstindex="+arr[i]+" second index="+arr[left]+" third index="+arr[right]);
	                left++;
	                right--;
	            } else if(localSum > twoSumTarget){
	                right--;
	            } else {
	                left++;
	            }
	        }
	        
	    }
	   
	}
	

}
