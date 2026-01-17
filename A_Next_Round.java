import java.util.*;
public class A_Next_Round{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int k= sc.nextInt();
        int count=0;
        int marks[]=new int[n];
        for(int i=0;i<n;i++){
            marks[i]=sc.nextInt();
        }
        for(int i=0;i<n;i++){
            if (marks[i]>0){
                if(marks[i]>=marks[k-1]){
                count++;
                }
            }
        }
        System.out.println(count);
    }
}