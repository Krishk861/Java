class Animal{
    public Animal(){
        System.out.println("I am a constructor");
    }
    void eat(){
        System.out.println("Animal is eating");
    }
}
class Dog extends Animal{
    void bark(){
        System.out.println("Dog is barking ");
    }
}
class Puppy extends Dog{
    void play(){
        System.out.println("Puppy is playing");
    }
}
public class Main{
    public static void main(String a[]){
        Puppy p1= new Puppy();
        p1.eat(); //From animal
        p1.bark(); //From Dog
        p1.play(); //From Puppy
        Puppy p2= new Puppy();
        p2.eat(); //From animal
        p2.bark(); //From Dog
        p2.play(); //From Puppy
    } 
}