package first;

/**
 * 懒汉式普通
 */
public class Singleton_lazy {
    private static Singleton_lazy singleton_lazy = null;
    private Singleton_lazy (){};
    private static Singleton_lazy getinstance(){
        if(singleton_lazy==null){
            singleton_lazy = new Singleton_lazy();
        }

        return singleton_lazy;
    }
}
