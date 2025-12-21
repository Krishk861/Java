import java.util.Scanner;

public class Prime {
    public static void main(String a[]){

        Scanner scan =new Scanner(System.in);
        System.out.print("Enter the number : ");
        int num= scan.nextInt();
        boolean isPrime=true;
        if(num<=1){
            isPrime=false;
        }
        else{
            for(int i=2;i*i<=num;i++){
                if (num%i==0){
                    isPrime=false;
                    break;
                }
            }
        }
        if (isPrime){
            System.out.println("The number is prime.");
        }
        else
            System.out.println("THe number is not a prime number.");
    }
    
}