import java.util.*;
public class A_I_Wanna_Be_the_Guy{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        Set<Integer> set= new HashSet<>();
        int p=sc.nextInt();
        for(int i=1;i<=p;i++){
            int levels=sc.nextInt();
            set.add(levels);
        }
        int q=sc.nextInt();
        for(int i=1;i<=q;i++){
            int levels=sc.nextInt();
            set.add(levels);
        }
        if(set.size()==n){
            System.out.println("I become the guy.");
        }
        else{
            System.out.println("Oh, my keyboard!");
        }
    }
}