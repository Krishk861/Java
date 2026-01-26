import java.util.*;
public class A_Pangram{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        sc.nextLine();
        String s=sc.nextLine().toLowerCase();
        Set<Character> set=new HashSet<>();
        for(char l: s.toCharArray()){
            if(l>='a' && l<='z'){
                set.add(l);
            }
        }
        if(set.size()==26){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }
    }
}