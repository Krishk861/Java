import java.util.*;
public class A_Candies_for_Nephews{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int steps=sc.nextInt();
        int extra=0;
        while(steps-->0){
            int n=sc.nextInt();
            if(n%3==1){
                extra=2;
            }
            else if(n%3==2){
                extra=1;
            }
            else{
                extra=0;
            }
            System.out.println(extra);
        }
    }
}