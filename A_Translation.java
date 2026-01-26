import java.util.*;
public class A_Translation {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        sc.nextLine();
        String a=sc.next();
        for(int i=0;i<s.length();i++){
            if(a.contains(String.valueOf(s.charAt(i)))){
                System.out.println("YES");
            }
            else{
                System.out.println("NO");
            }
        }
    }
}