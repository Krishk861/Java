import java.util.*;
public class A_Soldier_and_Bananas{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        int n=sc.nextInt();
        int w=sc.nextInt();
        int Req_amount=0;
        for(int i=1;i<=w;i++){
            Req_amount+=i*k;
        }
        if(n>Req_amount){
            System.out.println("0");
        }
        else{
            System.out.println(Req_amount-n);
        }
    }
}