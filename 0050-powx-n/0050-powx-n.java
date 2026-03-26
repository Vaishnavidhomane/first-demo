class Solution {
    public double myPow(double x, int n) {
        
        long N = n;  
        if (N < 0) {
            x = 1 / x;
            N = -N;
        }
        
        double result = 1;
        double current = x;
        
        
        while (N > 0) {
            
            if (N % 2 == 1) {
                result = result * current;
            }
           
            current = current * current;
            N = N / 2;
        }
        
        return result;
    }
}






// class Solution {
//     public double myPow(double x, int n) {
//         double i=1;
//         double k=-1;
//         double y=1;
//         double b=1;
//         if(n==0){
//             return 1;
//         }
//         if(n<0){
//             while(n<k){
//                 b=b*x;
//                 y=1/b;
                
// k--;
               

//             }
        
            
          
        
//         }
//         if(n>0){
//         while(i<=n){
//             y=y*x;

//             i++;

//         }}
//         return(double) y;
//     }
// }