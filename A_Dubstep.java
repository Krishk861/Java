import java.util.*;
public class A_Dubstep{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        String result= s.replaceAll("(WUB)+"," ").trim();
        System.out.print(result);
    }
}