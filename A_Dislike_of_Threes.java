import java.util.*;
public class A_Dislike_of_Threes{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int k=sc.nextInt();
        while(k-->0){
            int rating=sc.nextInt();
            if(rating<1400){
                System.out.printf("Division %d\n",4);
            }
            else if(rating<1600 && rating>=1400){
                System.out.printf("Division %d\n",3);
            }
            else if(rating<1900 && rating>=1600){
                System.out.printf("Division %d\n",2);
            }
            else if(rating>=1900){
                System.out.printf("Division %d\n",1);
            }
        }
    }
}