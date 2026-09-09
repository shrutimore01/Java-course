package ThisKeyword;
class Student{
    String name;
    int age;

    Student(String n,int a){
        name=n;
        age=a;

    }
    void display(){
        System.out.println(name+ " "+age);

    }
}
public class WithoutThis {
    public static void main(String[] args) {
        Student s1=new Student("Ram",21);
        s1.display();
    }
}
