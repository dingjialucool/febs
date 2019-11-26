package cc.mrbird.febs.test;

/**
 * @author Lenovo
 * @className Singleton2
 * @description 单例 饿汉式（静态代码块）
 * @date 2019/11/26 17:09
 * @Version 1.0
 */
public class Singleton2 {

    private Singleton2(){

    }

    private static Singleton2 instance;

    static{
        instance = new Singleton2();
    }

    /**
     * 优缺点一致，唯一不同就是创建类的过程放在了static静态代码块内
     * @return
     */
    public  static  Singleton2 getInstance(){
        return  instance;
    }
}
