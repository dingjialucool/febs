package cc.mrbird.febs.test;

/**
 * @author Lenovo
 * @className Singleton
 * @description 单例 饿汉式(静态变量)
 * @date 2019/11/26 16:56
 * @Version 1.0
 */
public class Singleton {

    private Singleton(){

    }

    private final static Singleton instance = new Singleton();

    /**
     * 饿汉式 当类加载的时候，就生成了实例
     * 优点：线程安全，只会生成一个实例
     * 缺点：有时候不需要此类，但类已经加载在内存中了 ，浪费内存
     * @return
     */
    public static Singleton getInstance(){
        return  instance;
    }

    public static void main(String[] args) {

        Singleton singleton1 = Singleton.getInstance();

        Singleton singleton2 = Singleton.getInstance();

        System.out.println(singleton1 == singleton2);

        System.out.println(singleton1.hashCode());

        System.out.println(singleton2.hashCode());
    }

}
