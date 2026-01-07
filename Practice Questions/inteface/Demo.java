interface Computer{
    void code();
}
class Laptop implements Computer{
    public void code(){
        System.out.println("Coding in Laptop");
    }
}
class Desktop implements Computer{ // This implementation will allow desk to be used
    public void code(){
        System.out.println("Coding in Desktop");
    }
}
class Developer{
    public void DevApp(Computer lap){
        lap.code();
    }
}

public class Demo{
    public static void main(){
        Computer lap=new Laptop();
        Computer desk=new Desktop();
        Developer Krish=new Developer();
        Krish.DevApp(lap);
        // Krish.Devapp(desk); // This will not work because desk is not referenced so we will try to use interface
        Krish.DevApp(desk);
    }
}