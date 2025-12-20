class Solution {
    public boolean isPalindrome(int x) {
      
int rev=0;
int lastdigit;
int original=x;
if(x<0){
    return false;

}

while(x>0){
    lastdigit=x%10;
    x=x/10;
    rev=(rev*10)+lastdigit;
}
return original==rev;


    }
} 
    