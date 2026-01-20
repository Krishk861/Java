import java.util.*;
public class A_Easy_Problem{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int testcase=sc.nextInt();
        for(int i=0;i<testcase;i++){
            int count=0;
            int b=1;
            int a=sc.nextInt()-1;
            while(a>0){
                a--;
                count++;
            }
            System.out.println(count);
        }
        
    }
}