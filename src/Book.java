import java.util.Objects;

public class Book {

    private String title;
    private Author author;
    private int year;

    public Book(String title, Author author, int year) {
        this.title = title;
        this.author = author;
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public Author getAuthor() {
        return this.author;
    }

    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }


    @Override
    public String toString() {
        return String.format("%s %s %s", title, author.toString(), year);
        //return String.format("%s %s %s", title, author, year); то же самое

    }

    @Override
    public int hashCode() {
        return Objects.hash(title, author, year);

    }

    @Override
    public boolean equals(Object l) {
        if (this == l) return true;
        if (l == null || getClass() != l.getClass()) return false;
        Book book = (Book) l;
        return year == book.year && Objects.equals(title, book.title) && Objects.equals(author,
                book.author);
    }

}




