import java.util.*;
public class A_Wrong_Subtraction{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        long n=sc.nextLong();
        long steps=sc.nextLong();
        while(steps-->0){
            if(n%10!=0){
                n-=1;
            }
            else{
                n/=10;
            }
        }
        System.out.println(n);
    }
}