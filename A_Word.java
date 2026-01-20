import java.util.*;
public class A_Word{
    static void casing(String s){
        int lower=0;
        int upper=0;
        for(char c: s.toCharArray()){
            if(Character.isUpperCase(c)){
                upper++;
            }
        }
        for(char c: s.toCharArray()){
            if(Character.isLowerCase(c)){
                lower++;
            }
        }
        if(lower<upper){
            System.out.println(s.toUpperCase());
        }
        else{
            System.out.println(s.toLowerCase());
        }
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String s=sc.next();
        casing(s);
    }
}