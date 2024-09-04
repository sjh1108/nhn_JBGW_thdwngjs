public class App {
    public static void main(String[] args) {
        Books books = new Books();

        System.out.println(books.search(4));

        int i = -1;
        while(++i < 5){
            System.out.println(1);
            System.out.println(books.search(i));
        }
        // for(Book b: books) {
        //     System.out.println(b);
        // }

        // books.forEach(System.out::println);
        
        // books.sort();
        // System.out.println("No Sort");
        // books.forEach(System.out::println);
        
        // books.sort((b1, b2) -> b1.getTitle().compareTo(b2.getTitle()));
        // System.out.println("Title Sort");
        // books.forEach(System.out::println);
        
        // books.sort((b1, b2) -> b1.getPrice().compareTo(b2.getPrice()));
        // System.out.println("Price Sort");
        // books.forEach(System.out::println);

    }
}
