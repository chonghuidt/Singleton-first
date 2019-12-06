package first;

import java.io.Serializable;

/**
 * 序列化单例
 * @author  lp
 */
public class SeriableSingleton implements Serializable {
    //产生背景：比如某些实例，不在虚拟机开启的时候也可以正常使用，序列化。直接操作。
    //把内存中的状态转化字节码，通过Io流写入到磁盘或者网络的io
    //反序列化，读取io转化成java对象，转换过程重新new对象
    //反序列化的时候对象会被破坏

    public static final SeriableSingleton seriableSingleton=new SeriableSingleton();
    private SeriableSingleton(){}
    private static SeriableSingleton getInstance(){
        return  seriableSingleton;
    }
    private Object read(){
        return seriableSingleton;
    }
}
