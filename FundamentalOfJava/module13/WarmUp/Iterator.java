package WarmUp;
public interface Iterator <T>{
    public T First();
    public T Next();
    public boolean IsDone();
    public T CurrentItem();
}