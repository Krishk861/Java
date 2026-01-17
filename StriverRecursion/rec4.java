//code for backtracing
import java.util.*;
public class rec4 {
    static void pattern(int i,int n){
        if(i>n){
            return;
        }
        pattern(i+1, n);
        System.out.println(i);
    }

    public static void main(String agrs[]){
    Scanner sc= new Scanner(System.in);
    int n= sc.nextInt();
    pattern(1,n);
    }
}
