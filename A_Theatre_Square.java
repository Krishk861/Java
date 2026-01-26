import java.util.*;

public class A_Theatre_Square {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a = sc.nextInt();
        System.out.println(((m+a-1)/a)*((n+a-1)/a));

        sc.close();
    }
}
