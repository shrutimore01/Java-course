package ThisKeyword;
class Parent{

    String name="Parent";

    void show(){
        System.out.println("Hello parent!");
    }
}
class Child extends Parent{
    String name="Child";

    void display(){
        System.out.println(super.name);
        super.show();
    }

}
public class SuperKeyword {
    public static void main(String[] args) {
        Child c1=new Child();
        c1.display();
    }
}
