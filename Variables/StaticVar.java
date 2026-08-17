package Variables;

public class StaticVar {
    String name;
     static String college="ABC";

    public static void main(String[] args) {
        StaticVar obj=new StaticVar();
        obj.name="John";
        System.out.println(obj.name);
        System.out.println(college);

        StaticVar obj1=new StaticVar();
        obj1.name="rahul";
        System.out.println(obj1.name);
        System.out.println(college);

    }
}
