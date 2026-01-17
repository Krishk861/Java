import java.util.*;
public class Main{
    Scanner sc=new Scanner(System.in);
    int n= sc.nextInt();
    int count=0;
    int sol(int n){
        for(int i=0;i<n;i++){
            int a=sc.nextInt();
            int b=sc.nextInt();
            int c=sc.nextInt();
            count++;
            if(a+b+c>=2){
                System.out.println(count);
            }
            

        }
}