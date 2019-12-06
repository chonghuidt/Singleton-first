package first;

/**
 * 单例模式的经典版本
 */
public class LazyInnerSingleton {

    //思路：在内部类里面实例化，将对象staic，外部类的构造函数进行判断，外部实例化获取单例是在调用内部类
    //这种懒汉式避免了饿汉式的内存浪费，也兼顾synchronized性能问题
    private LazyInnerSingleton(){
        //如果使用的话，先默认初始化内部类，没有使用就不初始化
        if(LazyHolder.LAZY!= null){  //如果已经存在实例，就不再调用任何方法，跑出异常
            throw new RuntimeException("创建多个实例错误");
        }
    }
    //static保证了单例的空间共享
    //保证这个方法不会被重写，重载
    public static final LazyInnerSingleton getInstance(){
            //在返回结果以前，一定会先加载内部类
            return LazyHolder.LAZY;
    }
    //默认不加载，实例化单例是放在内部类
    private static class LazyHolder{
        private static final LazyInnerSingleton LAZY = new LazyInnerSingleton();
    }

}
