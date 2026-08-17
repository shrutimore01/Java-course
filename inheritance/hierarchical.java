package inheritance;
class Empolyee{
    void work(){
        System.out.println("Empolyeee is working");
    }
}
class Developer extends Empolyee{
    void writecode(){
        System.out.println("Writing code");
    }
}
class tester extends Empolyee{
    void test(){
        System.out.println("Testing..");
    }
}
public class hierarchical {
    public static void main(String[] args) {
        Developer d=new Developer();
        d.work();
        d.writecode();

        tester t=new tester();
        t.work();
        t.test();
    }
}
