package construct.ex;

public class Book {
    String title;
    String author;
    int page;

    // 코드 완성
    Book(){
        this("","",0);
    }

    Book(String title, String author) {
        this(title, author, 0);
    }

    Book(String title, String author, int page) {
        this.title = title;
        this.author = author;
        this.page = page;
    }

    void displayInfo(){
        System.out.println("Title: " + title + "\nAuthor: " + author + "\nPage: " + page);
    }
}
