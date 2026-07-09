public class Main
{
	public static void main(String[] args) {
		System.out.println("Hello World");
		
		String s = "araaci";
		int k = 2;
		// take two indices, left and right
		//stop when size of map is > 2
		//at this point, move lft pointer till size of map is < 2
		// and then start adding chars from right index
		
		Map<Character, Integer> map = new HashMap<>();
		
		int left=0;
		int maxSubAlength =0;
		
		for(int i=0; i< s.length(); i++){
		    char c = s.charAt(i);
		    
		    if(!map.containsKey(c)){
		        map.put(c,1);
		    } else{
		        map.put(c,map.get(c)+1);
		    }
		    // shrink the map if size is greater than k
		    while(map.size() >k){
		        char leftChar = c.charAt(left);
		        if(map.get(leftChar) > 1){
		            map.put(leftChar, map.get(leftChar)-1);
		            
		        } else{
		            map.remove(leftChar);
		        }
		        left++;
		    }
		    
		    maxSubAlength = Math.max(maxSubAlength, i-left+1);
		    
		    
		}
		
	}
}
