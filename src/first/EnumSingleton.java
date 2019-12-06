package first;

/**
 * 枚举单例
 * @author lp
 */
public enum EnumSingleton {
    //常量中使用，常量就是大家都能够使用。一般定义在api中
    INSTANCE;
    private Object object;
    public Object getObject(){
        return object;
    }
    public void setObject(Object object){
        this.object=object;
    }
    public static EnumSingleton getInstance(){
        return INSTANCE;
    }
}
