import java.util.*;
public class A_Elephant{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
            int steps=0;
            if(n%5==0){
                steps=n/5;
            }
            else{
                steps=(n/5)+1;
            }
            System.out.println(steps);
    }
}
