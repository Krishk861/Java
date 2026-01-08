import java.util.*;
public class pattern {
void print1(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n;j++){
            System.out.print("*");
        }
        System.out.println("");
    }
}
void print2(int n){
    for(int i=0;i<=n;i++){
        for(int j=0;j<i;j++){
            System.out.print("*");
        }
        System.out.println("");   
        }
    }
void print3(int n){
    for(int i=0;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        System.out.println("");   
        }
    }
void print4(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(i);
        }
        System.out.println("");   
        }
    }
void print5(int n){
    for(int i=1;i<=n;i++){
        for(int j=5;j>=i;j--){
            System.out.print("*");
        }
        System.out.println("");   
    }
}
void print6(int n){
    for(int i=1;i<=n;i++){
        for(int j=5;j>=i;j--){
            System.out.print(i);
        }
        System.out.println("");   
    }
}
}
class Output{
    public static void main(String[] args) {
        pattern ab=new pattern();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter n:");
        int a=sc.nextInt();
        ab.print1(a);
        ab.print2(a);
        ab.print3(a);
        ab.print4(a);
        ab.print5(a);      
        ab.print6(a);      
        ab.print7(a);      
        ab.print8(a);      
        ab.print9(a);      
        ab.print10(a);      
    }
}
