class Solution {
    public int findComplement(int num) {
        
        // 2^noofbits-1 gives the mask for any no of bits i.e 111, 1111, 11, -----
        
        // xor the mask as any no xor 1 = compliment of that no
        
        if(num == 0) return 1;
        
        int nb = (int) (Math.log(num) / Math.log(2) ) + 1;           // formula for no of bits
        
        int mask = (1 << nb) - 1;       // a << b = a * 2^b  as we need 2^nb we can use power of fn
        
        return num ^ mask;
    }
}