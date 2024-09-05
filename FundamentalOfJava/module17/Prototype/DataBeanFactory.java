public class DataBeanFactory {
    private DataBean repo;

    public DataBeanFactory(DataBean dataBean){
        this.repo = dataBean;
    }

    public void registerDataBean(DataBean dataBean){
        repo = dataBean;
    }

    public DataBean getDataBean(){
        if(this.repo.getClass().getAnnotation(CreationType.class).type().equals("Prototype")){
            return this.repo.clone();
        }

        return this.repo;
    }
}