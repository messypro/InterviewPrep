class Solution {
    public String longestPalindrome(String s) {
        /// babad
        /// left , right 

        if(s != null && s.length() ==1){
            return s;
        }

        int maxlength= Integer.MIN_VALUE;

        String output =null;

        for(int i=0; i < s.length(); i++){

            for(int j=i; j < s.length(); j++){

                String subString = s.substring(i,j+1);

                System.out.println("subString="+subString);

                if(ispalindrome(subString) && maxlength < subString.length()){

                 output = subString;
                 maxlength = output.length();

                }


            }
        }

        return output;
        
    }

    private boolean ispalindrome(String s){

        if (s  == null){
            return false;
        }

        int left =0, right = s.length()-1;

        while(left < right){

            if(s.charAt(left) != s.charAt(right)){
                return false;
            } else{
                left++;
                right--;
            }
        }

        return true;
    }
}
