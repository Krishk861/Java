import java.util.*;
class Solution {
    public boolean isArmstrong(int n) {
        int k= String.valueOf(n).length();
        int sum =0;
        while(n>0){
            n=n%10;
            sum+=Math.pow(n,k);
            n/=10;
        }
        return sum==sum;
    }
}
public static void main(String args[]){
    int num=153;
    if(Solution.isArmstrong(num)){
        System.out.println(num+" is armstrong");
    }
    else{
        System.out.println(num +" not an armstrong");
    }
}