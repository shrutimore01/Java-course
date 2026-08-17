package inheritance;
class Grandfather{
    void grandfatherproptery(){
        System.out.println("Grandfather owns a house");
    }
}

class Father extends Grandfather{
    void fatherproperty(){
        System.out.println("Father  owns a car");
    }
}

class Child extends  Father{
    void childproptery(){
        System.out.println("Child owns the cycle");
    }
}
public class Main {
    public static void main(String[] args) {
        Child c=new Child();
        c.grandfatherproptery();
        c.fatherproperty();
        c.childproptery();
    }
}
