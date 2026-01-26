import java.util.*;

public class A_Puzzles{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int students = sc.nextInt();
        int puzzles = sc.nextInt();
        
        int[] arr = new int[puzzles];
        for(int i = 0; i < puzzles; i++){
            arr[i] = sc.nextInt();
        }
        // Sort the array
        Arrays.sort(arr);
        int mindiff = Integer.MAX_VALUE;
        for(int j = 0; j <= puzzles - students; j++){
            int diff = arr[j + students - 1] - arr[j];
            if(diff < mindiff){
                mindiff = diff;
            }
        }
        System.out.println(mindiff);
        sc.close();
    }
}