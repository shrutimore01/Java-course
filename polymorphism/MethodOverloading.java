package polymorphism;

 class Student {
    void Display(String name){
        System.out.println("Name: " + name);

    }
    void Display(int age){
        System.out.println("Age: " + age);
    }
    void Display(String name,int age){
        System.out.println("Name: " + name + ", Age: " + age);
    }


}
public  class MethodOverloading {
    public static void main(String[] args) {
        Student s=new Student();
        s.Display("Radha");
        s.Display(22);
        s.Display("Radha ",22);
    }
}
