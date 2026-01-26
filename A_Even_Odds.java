import java.util.*;
public class A_Even_Odds{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int index=sc.nextInt();
        int Odd_Count=(n+1)/2;
        if(index<Odd_Count){
            System.out.println(2*index-1);
        }
        else{
            System.out.println(2*(index-Odd_Count));
        }
    }
}
