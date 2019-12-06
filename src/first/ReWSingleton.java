package first;

public class ReWSingleton {
    private ReWSingleton(){
        if(LazyHolder.LAZY!=null){
            //已经创建了实例，跑出异常
            try {
                throw new Exception("创建多个实例！");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
    private static ReWSingleton getInstance(){
        return LazyHolder.LAZY;
    }

    private static class LazyHolder{
       private static final ReWSingleton LAZY = new ReWSingleton();
    }
}
