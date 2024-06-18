import java.util.Objects;

public class Main {
    public static void main(String[] args) {
        System.out.println("Homework13");
        Author author = new Author("Александр", " Пушкин ");
        Author author2 = new Author("Александр", " Грин ");
        Book book = new Book("Медный всадник", author, 1883);
        Book book2 = new Book("В снегу", author2, 1910);
        System.out.println(book);
        System.out.println(author.getAllFields());
        System.out.println(author2);
        System.out.println(author.compare() == author2.compare());
        System.out.println(author2.hashCode() == author.hashCode());
        System.out.println(author.equals(author2));
        System.out.println(book2.hashCode() == book.hashCode());
        System.out.println(Objects.equals(book,book2));
    }

}

