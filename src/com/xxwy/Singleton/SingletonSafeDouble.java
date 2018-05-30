package com.xxwy.Singleton;

/**
 * 线程安全的
 * @authon xxwy
 */
public class SingletonSafeDouble {

    private final String name;

    /**
     * volatile : 保证new对象的时候不会重排序
     */
    private static volatile SingletonSafeDouble instance = null;

    private SingletonSafeDouble(String name){
        this.name = name;
    }

    public static SingletonSafeDouble getInstance(){
        if(instance == null){
            //加锁
            synchronized (SingletonSafeDouble.class){
                if(instance == null){
                    instance = new SingletonSafeDouble("xxx");
                }
            }
        }
        return instance;
    }

}
