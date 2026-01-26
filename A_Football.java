import java.util.*;
public class A_Football {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int team1=0;
        int team2=0;
        while(n-->0){
            String s=sc.next();
            if(s.equals('A')){
                team1++;
            }
            else{
                team2++;
            }
            if(team1>team2){
                System.out.println("A");
            }
            else{
                System.out.println(s);
            }
        }
    }
}