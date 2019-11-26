package cc.mrbird.febs.test;

/**
 * @author Lenovo
 * @className Singleton4
 * @description 懒汉式（线程安全）
 * @date 2019/11/26 17:32
 * @Version 1.0
 */
public class Singleton4 {

    private  Singleton4(){

    }

    private static  Singleton4 instance = null;

    /**
     * 优点：实现了懒加载，且线程安全
     * 缺点：效率比较慢，每次调用都要同步进行
     * @return
     */
    public  static  synchronized  Singleton4 getInstance(){
        if (instance == null) {
            instance = new Singleton4();
        }
        return  instance;
    }

}
