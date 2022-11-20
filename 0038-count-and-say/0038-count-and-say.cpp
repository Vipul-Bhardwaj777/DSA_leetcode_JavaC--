class Solution {
public:
    string countAndSay(int n) {
     	if (1== n) return "1";  

    	if (2 == n) return "11";

    	

    	string res="11";

    	string s;

    

    	for (int i = 2; i < n; i++){   

    
    		int len = res.size();

            


    		for (int j = 0; j < len; j++){  

    		    

    		    int count=1;

    

            

				while ((j + 1 < len && res[j] == res[j + 1])){

					count++;    

					

				
j++;}
                

           

    			s+=to_string(count) + res[j];

    		}

    

          

    		res = s;

    		

    		

    		

    
s.clear();
    	}

    

    	return res;

    }

};