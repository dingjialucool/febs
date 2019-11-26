package cc.mrbird.febs.test;

/**
 * @author Lenovo
 * @className Singleton7
 * @description 枚举单例
 * @date 2019/11/26 17:59
 * @Version 1.0
 */
enum  Singleton7{

    /**
     * 充分利用枚举类的特性，只定义了一个实例，且枚举类是天然支持多线程的
     * 借助JDK1.5中添加的枚举来实现单例模式优点：
     * 1。不仅能避免多线程同步的问题
     * 2.还能防止反序列化重新创建新的对象
     */
    INSTANCE;

}
