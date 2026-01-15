// import java.util.ArrayList;

// class prime {
//     public boolean isPrime(int n) {
//         if(n<=1){
//             return false;
//         }
//         for(int i=2;i*i<=n;i++){
//             if(n%i==0){
//                 return false;
//             }
//         }
//         return true;
//     }
// }
class Solution {
    public int addDigits(int num) {
        int sum=0;
        while(num>0){
            int digit=num%10;
            sum+=digit;
            num/=10;
        }
        int size=0;
        while(sum>0){
            sum/=10;
        size++;
        }
    }
}