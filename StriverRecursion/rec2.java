
import java.util.Scanner;

public class rec2 {
    static void pattern(int i){
        if(i<1){
            return;
        }
        System.out.println(i);
        pattern(i-1);
    }
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.print("Enter the value of n: ");
        int n=scan.nextInt();
        pattern(n);
    }
    
}
