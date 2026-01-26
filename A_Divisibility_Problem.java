import java.util.*;

public class A_Divisibility_Problem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        for (int i = 0; i < n; i++) {
            int a = sc.nextInt();
            int b = sc.nextInt();

            int ans = (b - a % b) % b;
            System.out.println(ans);
        }

        sc.close();
    }
}
