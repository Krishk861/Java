//Code for backtracing
import java.util.Scanner;

public class rec5 {
    static void pattern(int i){
        if(i<1){
            return;
        }
        pattern(i-1);
        System.out.println(i);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=scan.nextInt();
        pattern(n);
    }
    
}
