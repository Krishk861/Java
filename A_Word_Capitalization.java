import java.util.*;
class Solution {
    public int[] plusOne(int[] digits) {
        int sum=0;
        digits[digits.length-1]+=1;
        return digits[0];
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        plusOne(int[n] digits);
    }
}