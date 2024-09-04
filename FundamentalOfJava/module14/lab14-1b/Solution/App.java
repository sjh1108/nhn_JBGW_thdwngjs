public class App {
    public static void main(String[] args) {
        Books books = new Books();

        for(Book b: books) {
            System.out.println(b);
        }

        System.out.println();

        books.sort();

        books.forEach(System.out::println);
    }
}
