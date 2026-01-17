import java.util.*;
public class A_Even_Odds{
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int index=sc.nextInt();
        ArrayList<Integer> list= new ArrayList<>();
        for(int i=1;i<=n;i+=2){
                list.add(i);              
            }
        for(int i=2;i<=n;i+=2){
            list.add(i);
        }
        System.out.println(list.indexOf(index));
    }
}
