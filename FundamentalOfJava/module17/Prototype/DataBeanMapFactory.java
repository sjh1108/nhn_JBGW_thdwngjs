import java.util.HashMap;

public class DataBeanMapFactory {
    private HashMap<CreationType, DataBean> dataBeanMap;

    private static DataBeanMapFactory repo;

    private DataBeanMapFactory(){
        this.dataBeanMap = new HashMap<CreationType, DataBean>();
    }

    public static void registerDataBean(DataBean dataBean) {
        if(repo == null){
            repo = new DataBeanMapFactory();
        }

        CreationType type = dataBean.getClass().getAnnotation(CreationType.class);
        repo.dataBeanMap.put(type, dataBean);
        // repo.dataBeanMap.put(dataBean.getClass().getAnnotation(CreationType.class).type(), dataBean);
    }

    public static DataBean getDataBean(String type) throws ClassNotFoundException {
        CreationType cType = Class.forName(type).getAnnotation(CreationType.class);

        if(cType.type().equals("Prototype")){
            return repo.dataBeanMap.get(cType).clone();
        }
        
        return repo.dataBeanMap.get(cType);
    }
}
