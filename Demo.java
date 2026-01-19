class Solution {
    public static boolean isPowerOfFour(int n) {
    while(n!=1){
        if(n%4==0){
            n=n/4;
            if(n==1){
                return true;
            }
        }
        else{
            return false;
        }
    }
    return false;
    }
    
    public static void main(String z[]) {
        var n=22;
        isPowerOfFour(n);
    }
}
