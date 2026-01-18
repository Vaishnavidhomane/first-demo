class Solution {
    public int myAtoi(String s) {
        int sign=1;
        long result=0;
        int i=0;
        int n=s.length();

        //for whitespace
        while(i<n && s.charAt(i)==' '){
            i++;
        }
        //for signed
        if(i<n &&( s.charAt(i)=='+' || s.charAt(i)=='-')){
            if(s.charAt(i)=='-'){
                sign=-1;
            }
            i++;

        }
        //coversion
        while(i<n && Character.isDigit(s.charAt(i))){
            result=result*10 + (s.charAt(i)-'0'); //ascii
            if(sign==1 && result>Integer.MAX_VALUE){
                return Integer.MAX_VALUE;

            }
            if(sign==-1 && -result<Integer.MIN_VALUE){
                return Integer.MIN_VALUE;

            }
            i++;

        }
        return (int)(sign*result);
        }
}