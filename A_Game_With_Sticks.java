import java.util.*;
public class A_Game_With_Sticks{
    public static void main(String[] args) {
        
    Scanner sc=new Scanner(System.in);
    int m= sc.nextInt();
    int n= sc.nextInt();
    int moves=Math.min(m, n);
    if(moves%2==1){
        System.out.println("Akshat");
    }
    else{
        System.out.println("Malvika");
    }
    }
}