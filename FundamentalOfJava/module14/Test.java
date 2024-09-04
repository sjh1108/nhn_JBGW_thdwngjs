public class Test {
    public static void main(String[] args){
        HashTable<String, String> hashtable = new HashTable<>();

        hashtable.put("Celine", "France");
        hashtable.put("Robert", "Washington");
        hashtable.put("Mague", "California");
        hashtable.put("Celine", "Seoul");

        System.out.println(hashtable.get("Robert"));
    }
}
