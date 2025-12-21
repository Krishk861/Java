import java.util.Scanner;
public class Fact_Iter {
    public static void main(String a[]){
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the number whose factorial is to be found :");
        int number= scan.nextInt();
        int factorial =1;
        for(int i=1;i<=number;i++){
            factorial= factorial*i;
        }
        System.err.printf("THe factorial of %d is : %d",number,factorial);
    }
    
}
