import java.util.Scanner;
public class Fibb {
    public static void main(){
        int a=0;
        int b=1;
        Scanner scan= new Scanner(System.in);
        System.out.print("Enter the number of terms of fibonacci series : ");
        int number = scan.nextInt();
        if (number>=1)
            System.out.print(a+" ");
        if (number>=2)
            System.out.print(b+" ");
        for (int i=2;i<number;i++){
            int c=a+b;
            a=b;
            b=c;
            System.out.print(c+" ");
        }
        scan.close();
    }
}
