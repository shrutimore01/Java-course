package polymorphism;

class Animal{
    void sound(){
        System.out.println("Animal makes Sound");
    }

}
class Dog extends Animal{
    void sound(){
        System.out.println("Dogs barks");
    }
}
class Cat extends Animal{
    void sound(){
        System.out.println("Cats meoww");
    }
}
public class MethodOverriding {
    public static void main(String[] args) {
        Animal a=new Cat();
        a.sound();
    }
}
