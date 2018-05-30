package com.xxwy.Singleton;

import java.time.Instant;

/**
 * @author  xxwy
 * 一个类的内部创建后，在整个生命周期不会发生变化，不变类
 * 全局信息配置
 * 使用案例：支付接口调用，连接支付服务器的时候要写配置类，这里使用了单例模式
 */
public class SingletonUnsafe {

    /**
     * private final 属性
     */
    private final String name;

    /**
     * 实现线程安全 instance = new SingletonUnsafe
     */
    private static SingletonUnsafe instance;

    private SingletonUnsafe(String name){
        this.name = name;
    }

    public static SingletonUnsafe getInstance(){
        if(instance == null) {
            instance = new SingletonUnsafe("SingletonUnsafe");
        }
        return instance;
    }
}
