public class Book
{
    private String author;
    private String title;

    public String getAuthor()
    {
        return this.author;
    }

    public String getTitle()
    {
        return this.title;
    }

    public Book (String author, String title)
    {
        this.author = author;
        this.title = title;
    }

    public static Book of (String author, String title)
    {
      return new Book(author,title);
    }

    public static void main (String[] args)
    {
        Book book = Book.of("Isaac Asimov", "The Galaxy");
        System.out.println(book.getAuthor() + "\n" + book.getTitle());
    }
}
