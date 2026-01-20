import java.util.*;
public class A_I_love_username{
    public static void main(String[] args) { 
        Scanner sc=new Scanner(System.in);
        int n= sc.nextInt();
        int arr[]=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        
        int amazing=0;
        int max=arr[0];
        int min=arr[0];
        for(int i=1;i<n;i++){
            if(arr[i]>max){
                amazing++;
                max=arr[i];
            }
            else if(arr[i]<min){
                amazing++;
                min=arr[i];
            }
        }
        System.out.println(amazing);
    }    
}