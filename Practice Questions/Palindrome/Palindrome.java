import java.util.Scanner;
public class Palindrome {
    public static void main(String[] args) {
        System.out.print("Enter the string which is to be checked :");
        Scanner scan= new Scanner(System.in);
        String sentence=scan.nextLine();
        String reversed= new StringBuilder(sentence).reverse().toString();
        if(sentence.equals(reversed)){
            System.out.println("The string is a palindrome");
        }
        else
            System.out.println("The string is not a palindrome");
    }    
}
