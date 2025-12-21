import java.util.Scanner;
public class ReverseStr {
    public static void main(String a[]){
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the string which is to be reversed :");
        String sentence= scan.nextLine();
        String reversed = new StringBuilder(sentence).reverse().toString();
        System.out.println(reversed);
    }


}
