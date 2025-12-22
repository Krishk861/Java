import java.util.Scanner;
class VowelConsonantsCalculator {
    int vowels=0;
    int consonants=0;
    void process(String word){
    word=word.toLowerCase();
    for(int i=0;i<word.length();i++){
        char ch = word.charAt(i);
        if(ch=='a' ||ch== 'e' || ch=='i' || ch=='o' || ch=='u'){
            vowels++;
        }
        else{
            consonants++;
        }
    }
    }   
}

public class Result {
    public static void main(String[] args) {
        System.out.print("Enter the word :");
        Scanner scan = new Scanner(System.in);
        String word= scan.nextLine();
        VowelConsonantsCalculator Calc= new VowelConsonantsCalculator();
        Calc.process(word);
        System.out.printf("The number of vowels : %d%n",Calc.vowels);
        System.out.printf("The number of consonants : %d",Calc.consonants);
    }

    
}
