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
        for(int j=1;j<=n-i+1;j++){
            System.out.print("*");
        }
        System.out.println("");   
    }
}
void print6(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=n-i+1;j++){
            System.out.print(j);
        }
        System.out.println("");   
    }
}
void print7(int n){
    for(int i=1;i<=n;i++){
        //space
        for(int j=0;j<n-i;j++){
            System.out.print(" ");
        }
        //star
        for(int j=0;j<2*i-1;j++){
            System.out.print("*");
        }

        //space
        for(int j=0;j<n-i;j++){
            System.out.print(" ");
        }
        System.out.println(""); 
    }
}
void print8(int n){
    for(int i=0;i<n;i++){
//        //Space
        for(int j=0;j<i;j++){
            System.out.print(" ");
        }
        //star
        for(int j=0;j<2*n-(2*i+1);j++){
            System.out.print("*");
        }    
        //Space
        for(int j=0;j<i;j++){
            System.out.print(" ");
        }
        System.out.println("");
    }
}
void print9(int n){
    for(int i=1;i<=2*n-1;i++){
        int stars=i;
        if(i>n) stars=2*n-i;
        for(int j=1;j<=stars;j++){
            System.out.print("*");
        }
        System.out.println("");
    }
}
void print10(int n){
    int start=1;
    for(int i=1;i<=n;i++){
        if(i%2==-0){
            start=0;
        }
        else{
            start=1;
        }
        for(int j=0;j<i;j++){
            System.out.print(start);
            start=1-start;
        }
        System.out.println("");
    }
}
void print11(int n){
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(j);
        }
        for(int j=1;j<2*n-(2*i);j++){
            System.out.print(" ");
        }
        for(int j=i;j>=1;j--){
            System.out.print(j);
        }
        System.out.println("");
    }
}
void print12(int n){
    int num=1;
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(num+ " ");
            num++;
        }
        System.out.println("");
    }
}
void print13(int n){
    for(int i=1;i<=n;i++){
        char a='A';
        for(int j=1;j<=i;j++){
            System.out.print(a);
            a++;
        }
        System.out.println("");

    }
}
void print14(int n){
    for(int i=1;i<=n;i++){
        char a='A';
        for(int j=1;j<=n-i+1;j++){
            System.out.print(a);
            a++;
        }
        System.out.println("");

    }
}
void print15(int n){
    char a='A';
    for(int i=1;i<=n;i++){
        for(int j=1;j<=i;j++){
            System.out.print(a);
        }
        a++;
        System.out.println("");
    }
}
void print16(int n){
    for(int i=0;i<n;i++){
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        char ch='A';
        int breakpoint= (2*i+1)/2;
        for(int j=0;j<2*i+1;j++){
            System.out.print(ch);
            if(j<=breakpoint) ch++;
            else ch--;
        }
        for(int j=0;j<n-i-1;j++){
            System.out.print(" ");
        }
        System.out.println("");
    }
}
void print17(int n){
    for(int i=0;i<n;i++){
        char ch='E';
        for(int j=n;j>i;j--){
            System.out.print(ch);
            ch--;
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
        // ab.print1(a);
        // ab.print2(a);
        // ab.print3(a);
        // ab.print4(a);
        // ab.print5(a);      
        // ab.print6(a);      
        // ab.print7(a);      
        // ab.print8(a);      
        // ab.print9(a);      
        // ab.print10(a);      
        // ab.print11(a);      
        // ab.print12(a);      
        //ab.print13(a);      
        // ab.print14(a);      
        // ab.print15(a);      
        // ab.print16(a);      
        ab.print17(a);      
    }
}
