package ThisKeyword;
class student{
    String name;
    int age;

    student(String name,int age){
       this.name=name;
        this.age=age;

    }
    void display(){
        System.out.println(name+ " "+age);

    }
}
public class WithThis {
    public static void main(String[] args) {
        student s1 = new student("Ram", 21);
        s1.display();
    }
}
