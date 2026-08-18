class Solution {
    public String findReplaceString(String s, int[] indices, String[] sources, String[] targets) {
        // given string abcd
        // indices 0, 1
        // repalace them with eee
        // StringBuilder, 
        // 

        // check overlap in souces and return if present
        //

        // add validations 

        if(sources == null || targets == null || s == null){
            return s;
        }

        String previousString = sources[0];

        for(int j=1; j< sources.length; j++){

            String currentString = sources[j];

            if(previousString.charAt(previousString.length()-1) == currentString.charAt(0)){
                return s;
            }

            
        }

        StringBuilder output = new StringBuilder();

        char [] array = s.toCharArray();

        Set<Integer> set = new HashSet<>();
            for (int index : indices) {
                set.add(index); 
            }

        List<String> sourcesList = Arrays.asList(sources);    


        int i=0;

        int targeIndex =0;
        int sourcesIndex =0;


        while(i< array.length){

            // here also need to check for substring

            // abcde 
            // bc
            // edge case of handling overlap
            System.out.println("Old i ="+i);

            if(set.contains(i) ){

                // substring in sources has to present in string

                String result = s.substring(i, sources[sourcesIndex].length());
                System.out.println("result="+result);
                if(result != null  && result.equals(sources[sourcesIndex])){

                    output.append(targets[targeIndex]);
                    targeIndex++;
                    System.out.println("Before i ="+i);
                    i= i+ sources[sourcesIndex].length();
                    sourcesIndex++;

                    System.out.println("After i ="+i);

                }

                output.append(array[i]);
                i++;


            } else{

                output.append(array[i]);
                i++;

                 System.out.println(" else i ="+i);

            }
        }


        return output.toString();

        
        
    }
}
