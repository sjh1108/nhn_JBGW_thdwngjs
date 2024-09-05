public class ObjectFactory {
    Product p1;

    private static ObjectFactory repository;

    private ObjectFactory() {
        this.p1 = new Product(1, "Not Set");
    }

    public static ObjectFactory getRepository(){
        if(repository == null){
            repository = new ObjectFactory();
        }
        return repository;
    }

    public Product getProduct() {
        return this.p1.clone();
    }
}
