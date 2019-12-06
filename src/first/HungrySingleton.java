package first;

/**
 * 普通饿汉式
 */
public class HungrySingleton {
    private static volatile HungrySingleton hungrySingleton = new HungrySingleton();
    private  HungrySingleton(){};
    private static HungrySingleton getInstance(){

        return hungrySingleton;
    }
}
