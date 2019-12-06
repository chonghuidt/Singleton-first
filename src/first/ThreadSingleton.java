package first;

/**
 * @author lp
 */
public class ThreadSingleton {
     //jdk8的新特性：也是在实例化这个类
     //利用多线程开启一个单例
    //在分布式系统中获取单例
    private static  final ThreadLocal<ThreadSingleton> threadlocal=
           new ThreadLocal<ThreadSingleton>(){
        //线程：里面run定义线程做什么：在这里就是获取一个类的实例，方法的名字。因为这是一个线程。
           //ThreadLocal 提供了get方法获取当前线程的值
               //多线程里面进行方法的操作的时候只有一次。保证了单例
        protected  ThreadSingleton initiValue(){
            return  new ThreadSingleton ();
        }
    };

    private ThreadSingleton(){}
    private static final ThreadSingleton getInstance(){
        return  threadlocal.get();
    }
}
