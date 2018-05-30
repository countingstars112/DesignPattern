package com.xxwy.Strategy;

/**
 * @authon xxwy
 * 策略模式, 配合lambda表达式
 * 例子：输出age>10的人 ， 输出name=wang 的人，在读取数据，比较，输出数据 。 中有重复的代码。
 * 这个时候抽取不一样的代码就ok
 */
public class Main {

    public static void dosome(String name,StrategyInterface strategyInterface){
        System.out.println("做一些事情");
        strategyInterface.Cook(name);
        System.out.println("end");
    }

    public static void main(String[] args) {
        StrategyInterface rich = (name) -> System.out.println(name);
        Main.dosome("rich", rich);
    }
}
