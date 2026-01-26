import java.util.*;
public class A_A_B_Again{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            int sum=0;
            int ie=sc.nextInt();
            while(ie>0){
                sum+=ie%10;
                ie/=10;
            }
            System.out.println(sum);
        }
    }
}