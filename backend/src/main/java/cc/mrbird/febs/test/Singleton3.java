package cc.mrbird.febs.test;

/**
 * @author Lenovo
 * @className Singleton3
 * @description  单例 懒汉式（线程不安全）
 * @date 2019/11/26 17:24
 * @Version 1.0
 */
public class Singleton3 {

    private Singleton3(){

    }

    private static  Singleton3 instance = null;

    /**
     * 优点：这种方式起到了懒加载的效果，但只能在单线程下使用
     * 缺点：在多线程环境下不安全，当有一个线程进入了if（instance == null） 语句块，但没有执行产生实例的语句块，这时又有一个线程进入if语句块，这时就会生成多个实例
     * @return
     */
    public static   Singleton3 getInstance(){

        if (instance == null) {
            instance = new Singleton3();
        }
        return  instance;
    }


}
