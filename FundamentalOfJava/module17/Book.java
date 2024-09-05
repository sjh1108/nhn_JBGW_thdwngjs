public class Book implements Cloneable{
    private int isbn;
    private String title;

    public Book(int isbn, String title) {
        this.isbn = isbn;
        this.title = title;
    }

    public String getName(){
        return this.title;
    }

    @Override
    public Book clone(){
        return new Book(this.isbn, this.title);
    }
}
