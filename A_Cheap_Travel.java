import java.util.*;
public class A_Cheap_Travel {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int m=sc.nextInt();
        int a=sc.nextInt();
        int b=sc.nextInt();
        int One_way=n*a;
        int double1=n/m*b;
        int remaining=n%m;
        int remaining_cost=Math.min(remaining*a, b);
        int min=Math.min(remaining_cost+double1,One_way);
        System.out.println(min);
    }
}