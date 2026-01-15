package StriverRecursion;

import java.util.*;
public class rec1 {
    static void pattern(int i,int n){
        if(i>n){
            return;
        }
        System.out.println(i);
        pattern(i+1, n);
    }

    public static void main(String agrs[]){
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    pattern(1,n);
    }
}
