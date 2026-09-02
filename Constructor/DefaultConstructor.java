package Constructor;
class Book{
    String title;
    int price;

    Book(){
        title="Java";
        price=400;

    }
    void Display(){
        System.out.println("Book name :"+title);
        System.out.println("price:"+price);

    }
}
public class DefaultConstructor {
    public static void main(String[] args) {
        Book b=new Book();
        b.Display();

    }
}
