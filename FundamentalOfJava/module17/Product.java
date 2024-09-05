public class Product implements Cloneable{
    private int no;
    private String name;
    private String from;

    public Product(int no, String name){
        this.no = no;
        this.name = name;
        this.from = "A product that only can buy at Coupang";
    }
    
    public int getNo(){
        return this.no;
    }

    public String getName(){
        return this.name;
    }

    public String getFrom(){
        return this.from;
    }

    @Override
    public String toString(){
        return this.no + ", " + this.name;
    }

    @Override
    public Product clone(){
        return new Product(this.no, this.name);
    }
}
