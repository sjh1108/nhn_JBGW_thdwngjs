import java.util.HashMap;

public class ObjectRepository {
    private HashMap<String, Object> map = new HashMap<>();

    private static ObjectRepository repository;

    private ObjectRepository() {
        this.map = new HashMap<>();
    }


    public static ObjectRepository getRepository() {
        if (repository == null) {
            repository = new ObjectRepository();
        }
        return repository;
    }

    public void put(String key, Object object){
        map.put(key, object);
    }

    public Object get(String name){
        return map.get(name);
    }
}
