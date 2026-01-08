import java.util.*;
public class Rev{
    public static void main(String a[]){
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the number :");
        int number= scan.nextInt();
        int rev=0;
        while(number!=0){
            int digit=number%10;
            rev=rev*10+digit;
            number=number/10;

        }
        System.out.println("The reversed number is :"+ rev);
        scan.close();
    }
}