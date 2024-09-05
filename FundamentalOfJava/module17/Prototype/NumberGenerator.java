@CreationType(type = "Singleton")
public class NumberGenerator implements DataBean{
    public NumberGenerator(){
    }
    
    @Override
    public DataBean clone() {
        return this;
    }
}
