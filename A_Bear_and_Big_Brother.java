import java.util.*;
public class A_Bear_and_Big_Brother{
    static void Weight(int a,int b){
        int count=0;
        while(a<=b){
            a*=3;
            b*=2;
            count++;
        }
        System.out.println(count);
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        Weight(a, b);
    }
}