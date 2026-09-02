package Constructor;
class Student{
    String name;
    int rollno;

    Student(String n,int r){
        name=n;
        rollno=r;
    }
   void  Display(){
       System.out.println("Name :"+name);
       System.out.println("Roll no:"+rollno);
   }
}
public class Parameterized {
    public static void main(String[] args) {
        Student s1=new Student("Radha",21);
        s1.Display();

    }
}
