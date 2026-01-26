import java.util.*;
public class A_Police_Recruits{
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n=sc.nextInt();
        int untreated=0;
        int police=0;
        int crimes=0;
        while(n-->0){
            int occurence=sc.nextInt();
            if(occurence>0){
                police+=occurence;
            }
            else{
                if(police>0){
                    police--;
                }
                else{
                    untreated++;
                }
            }
            
        }
        System.out.println(untreated);
    }
}