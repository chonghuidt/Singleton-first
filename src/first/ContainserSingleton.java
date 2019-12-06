package first;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * 容器化单例：Spring框架使用的是这种
 */
public class ContainserSingleton {
    //空参构造
    private ContainserSingleton(){

    }
    //模拟ioc的模式，key是名称，value是一个实例，ConcurrentHashMap特点：对于并发访问数据安全。
    private static Map<String,Object> ioc = new ConcurrentHashMap<>();
    //这个返回值是object，传参给一个名字
    public static Object getInstance(String className) {
        //保证线程安全
        synchronized (ioc) {
            //如果集合里面没有当前这个类的实例,那么就创建这个类的实例
            if (!ioc.containsKey(className)) {
                Object object = null;

                try {
                    //利用反射获取类的实例
                    object = Class.forName(className).newInstance();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (ClassNotFoundException e) {
                    e.printStackTrace();
                }
                //把实例放入到map集合
                ioc.put(className, object);
                return object;

            } else {
                return ioc.get(className);
            }

        }

    }
}
