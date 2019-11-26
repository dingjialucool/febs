package cc.mrbird.febs.test;

/**
 * @author Lenovo
 * @className Singleton5
 * @description 双重检查单例
 * @date 2019/11/26 17:42
 * @Version 1.0
 */
public class Singleton5 {

    private Singleton5(){

    }

    private static volatile   Singleton5 instance;

    /**
     *  线程安全 懒加载 效率高
     * @return
     */
    public static Singleton5 getInstance(){
        if (instance == null) {
            synchronized (Singleton5.class){
                if(instance == null){
                    instance = new Singleton5();
                }
            }
        }
        return  instance;
    }

}
