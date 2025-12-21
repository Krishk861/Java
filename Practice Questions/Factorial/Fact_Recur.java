import java.util.Scanner;
class Recursion{
    static int factorial(int n)
    {
    if(n==0 || n==1){
        return 1;
    }
        return n*factorial(n-1);
    }
    }

public class Fact_Recur {
    public static void main(String a[]){
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the number whose factorial is to be found :");
        int number= scan.nextInt();
        
        int result=Recursion.factorial(number);
        System.out.println("Factorial= "+ result);
        
    }
    
}
