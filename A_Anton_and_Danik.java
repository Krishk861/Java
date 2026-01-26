import java.util.*;
public class A_Anton_and_Danik{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        String s=sc.next();
        int anton=0;
        int danik=0;
        for(int i=0;i<n;i++){
            if(s.charAt(i)=='A'){
                anton++;
            }
            else if(s.charAt(i)=='D'){
                danik++;
            }
        }
        if(danik<anton){
            System.out.println("Anton");
        }
        else if(anton==danik){
            System.out.println("Friendship");
        }
        else{
            System.out.println("Danik");
        }
    }
}