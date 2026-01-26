import java.util.*;

public class A_Dragons {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int strength=sc.nextInt();
        int dragons=sc.nextInt();
        int final1=0;
        for(int i=0;i<dragons;i++){
            int drag_str=sc.nextInt();
            int boost=sc.nextInt();
            if(strength>drag_str){
                strength+=boost;
            }
            final1=strength+boost*dragons;
        }
        if(strength==final1){
            System.out.println("YES");
        }
        else{
            System.out.println("NO");
        }

        
        sc.close();
    }
}
