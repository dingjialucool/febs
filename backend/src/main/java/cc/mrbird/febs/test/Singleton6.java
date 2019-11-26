package cc.mrbird.febs.test;

/**
 * @author Lenovo
 * @className Singleton6
 * @description 静态内部类单例
 * @date 2019/11/26 17:49
 * @Version 1.0
 */
public class Singleton6 {

    private Singleton6(){

    }


    private static  class SingleInstance{
        private static  final  Singleton6 INSTANCE = new Singleton6();
    }

    /**
     * 静态内部类单例方式
     *         1、这种方式采用了类加载机制来保证初始化实例时只有一个线程
     *         2、巧妙的将实例化Singleton操作放进getInstance方法中，getInstance方法返回静态内部类中实例化好的Singleton
     *         3、类的静态属性只会在第一次加载类的时候初始化，也就是只会初始化一次，在这里，JVM帮我们保证了线程的安全，类在初始化时，别的线程无法进入。
     *
     *         优点：线程安全、利用静态内部类特点实现延迟加载、效率高
     *         开发中推荐使用这种静态内部类单例方式！
     *
     * static静态内部特点：
     * 1、外部类加载不会导致内部类加载，保证了其懒加载
     *
     * @return
     */
    public  static synchronized   Singleton6 getInstance(){
        return  SingleInstance.INSTANCE;
    }


}
