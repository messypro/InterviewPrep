
public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
	    int [] arr = {1, 2, 4, 6, 10};
	    int target = 8;
	    
	    int left =0, right= arr.length-1;
	    
	    while(left < right){
	        int localSum = arr[left] + arr[right];
	        if(localSum == target){
	            System.out.println("index1="+left+" index2="+right);
	            break;
	        } else if(localSum < target){
	            left++;
	        } else{
	            right--;
	        }
	    }
		
	}
}
