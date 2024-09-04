public class App {
    public static void main(String[] args) {
        Books books = new Books();

        for(Book b: books) {
            System.out.println(b);
        }

        System.out.println();
        books.sort();
        books.forEach(System.out::println);

        books.sort((b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));
        System.out.println();
        books.forEach(System.out::println);

        books.sort((b1, b2) -> b1.getPrice().compareTo(b2.getPrice()));
        System.out.println();
        books.forEach(System.out::println);
    }
}
