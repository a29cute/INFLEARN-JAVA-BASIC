package construct.ex;

public class BookMain {
    public static void main(String[] args) {

        Book book0 = new Book();
        book0.displayInfo();

        Book book1 = new Book("Hello Java","Seo");
        book1.displayInfo();

        Book book2 = new Book("JPA 프로그래밍","kim", 700);
        book2.displayInfo();
    }
}
