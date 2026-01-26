import java.util.*;

public class A_A_B{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        for(int i=0;i<n;i++){
            String s=sc.next();
            int a=s.charAt(0)-'0';
            int b=s.charAt(2)-'0';
            System.out.println(b);
        }
    }
}