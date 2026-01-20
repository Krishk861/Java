import java.util.*;;
public class A_String_Task {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String s=sc.next();
        String newString= new String(s.toLowerCase());
        for(int i=0;i<s.length();i++){
            if(newString.charAt(i)== 'a'||newString.charAt(i)== 'e'||newString.charAt(i)== 'i'||newString.charAt(i)== 'o'||newString.charAt(i)== 'u'||newString.charAt(i)== 'y'){
                newString = newString.replace(String.valueOf(newString.charAt(i)), "");
            }
        }
        System.out.println(newString);
    }
}
