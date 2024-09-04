public class Book implements Comparable<Book> {
    private int no;
    private String title;
    private String subTitle;
    private String author;
    private String image;
    private int price;
    private String description;

    public Book(int no, String title, String subTitle, String author, String image, int price, String description) {
        this.no = no;
        this.title = title;
        this.subTitle = subTitle;
        this.author = author;
        this.image = image;
        this.price = price;
        this.description = description;
    }

    public int getNo() {
        return this.no;
    }

    public String getTitle() {
        return this.title;
    }

    public String getSubTitle() {
        return this.subTitle;
    }

    public String getAuthor() {
        return this.author;
    }

    public String getImage() {
        return this.image;
    }

    public String getPrice() {
        return String.format("%,d", this.price);
    }

    public String getDescription() {
        return this.description;
    }

    @Override
    public String toString() {
        return this.no + ", " + this.title + "," + this.author + ", " + this.getPrice();
    }

    public int compareTo(Book book) {
        return this.no - book.no;
    }
}