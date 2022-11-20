class Solution {
public:
    bool isSumEqual(string firstWord, string secondWord, string targetWord) {
        
        string s1="";
        string s2="";
        string s3="";
        
        for(int i=0;i<firstWord.size();i++)
            {
         s1+= to_string(firstWord[i]-97);
        }
       
        
         for(int i=0;i<secondWord.size();i++)

            {

         s2+= to_string(secondWord[i]-97);

        }

       
        
         for(int i=0;i<targetWord.size();i++)
            {
         s3+= to_string(targetWord[i]-97);
        }
       
        
        int a=stoi(s1);
        int b=stoi(s2);
        int c=stoi(s3);
        
        if(a+b==c)
            return true;
        
        
        
        
        
 return false;   }
};