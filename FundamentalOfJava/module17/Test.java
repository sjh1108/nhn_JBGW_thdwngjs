public class Test{
    public static void main(String[] args){
        ObjectRepository repo = ObjectRepository.getRepository();
        Product p = new Product(1, "Not Set");
        Book b = new Book(1234, "Pipe Line");

        repo.put(p.getClass().getName(), p);
        repo.put(b.getClass().getName(), b);

        Book b1 = (Book) repo.get(Book.class.getName());
        Book b2 = (Book) repo.get(Book.class.getName());

        System.out.println(b1);
        System.out.println(b2);
    }
}