package End;
class A{
    public void m(){
        System.out.println("A");
    }
}

class B extends A{
    public void m(){
        System.out.println("B");
    }
}

class C extends B{
    public void m(){
        System.out.println("C");
    }
}

class D extends C{
    public void m(){
        System.out.println("D");
    }
}

public class Test{
    public static void main(String[] args){
        D d = new D();
        C c = d;
        B b = c;
        A a = b;

        a.m(); b.m(); c.m(); d.m();
    }
}