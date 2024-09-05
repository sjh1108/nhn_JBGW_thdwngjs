public class Test {
    public static void main(String[] args){
        try{
            Student s = new Student(1, "Celine");
            DataBeanFactory studentFactory = new DataBeanFactory(s);
            // DataBeanMapFactory.registerDataBean(s);
    
            NumberGenerator n = new NumberGenerator();
            DataBeanFactory numberGeneratorFactory = new DataBeanFactory(n);
            // DataBeanMapFactory.registerDataBean(n);

            DataBean s1 = studentFactory.getDataBean();
            DataBean s2 = studentFactory.getDataBean();
            DataBean n1 = numberGeneratorFactory.getDataBean();
            DataBean n2 = numberGeneratorFactory.getDataBean();
    
            // DataBean s1 = DataBeanMapFactory.getDataBean("Student");
            // DataBean s2 = DataBeanMapFactory.getDataBean("Student");
            // DataBean n1 = DataBeanMapFactory.getDataBean("NumberGenerator");
            // DataBean n2 = DataBeanMapFactory.getDataBean("NumberGenerator");
    
            System.out.println(s);
            System.out.println(s1);
            System.out.println(s2);
    
    
            System.out.println(n);
            System.out.println(n1);
            System.out.println(n2);
        }
        catch(Exception e){
            e.printStackTrace();
        }

    }
}
