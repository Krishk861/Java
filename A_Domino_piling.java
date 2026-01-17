import java.util.*;
public class A_Domino_piling{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int m= sc.nextInt();
        int n= sc.nextInt();
        int count=0;
        if(m%2==0 && n%2!=0){
            count=n*(m/2);
        }
        else if(n%2==0 && m%2!=0){
            count=m*(n/2);
        }
        else if(n%2==0 && m%2==0) {
            count=(m/2)*(n);
        }
        else{
            count=(m*n/2);
        }
        System.out.println(count);
    }
}