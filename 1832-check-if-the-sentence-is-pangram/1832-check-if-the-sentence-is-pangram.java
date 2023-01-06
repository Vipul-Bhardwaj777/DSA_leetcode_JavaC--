class Solution {
    public boolean checkIfPangram(String sentence) {
        
       if (sentence.length() < 26) {

			return false;
           }
        
        int[] ans=new int[26];
        
        for(int i=0;i<sentence.length();i++)
            {
            
         ans[sentence.charAt(i)-'a']++;       
           
            }
        
        for(int s: ans)
            {
            if(s==0)
                return false;
            }
        
        return true;
       
    }
}