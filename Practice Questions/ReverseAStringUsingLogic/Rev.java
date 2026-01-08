import java.util.*;
public class Rev {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the string :");
        String a=sc.nextLine();
        String rev="";
        for(int i =a.length()-1;i>=0;i--){
            rev=rev +a.charAt(i);
        }
        System.out.println("Reversed String :"+rev);
    }
    
}
