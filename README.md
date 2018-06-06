# 设计模式



xxwy-设计模式
每周任务：设计模式更新，争取在七月份可以过一遍设计模式

格式：xx模式：包名



## **结构型模式** ：

- ### 代理模式：Proxy

- ### 适配器模式：



## **创建型模式**

- ### 工厂模式：factory

  - #### 简单工厂模式：

    - **缺点：**
      - 工厂方法没有满足开闭原则，如果要加一个产品类，要修改工厂方法的判断条件。

  - #### 工厂模式：

    - (工厂接口实现：，ChineseFoodFactory实现接口FoodFactory ， 生成继承Food的ChineseFood)
    - **使用范围**：
      - 当客户端不需要知道要使用对象的创建过程
      - 客户程序使用的对象存在变动的可能，或者根本就不知道使用哪一个具体的对象。
    - **自己的理解** ：
      - 因为多态的原因 ，父类的引用指向子类的实现 。客户端定义返回值的时候，不用知道到底使用了哪个工厂生产了撒种类的食物。
    - **限制**：
      - 在客户端将具体的工厂角色写死，产品创建条件的改变必然会引起工厂角色的修改 **这种情况，可以使用java反射机制与配置文件巧妙结合突破限制----在spring中体现 **

  - #### 抽象工厂模式：

    - 涉及产品族的问题，比如餐馆的菜谱，中国菜还有很多种类，再抽象一个Factory，让他实现你具体的菜的工厂。

- ### 单例模式：Singleton

  - 保证一个类只有一个实例，并提供一个访问他的全局访问点

  - **使用范围**：

    - 全局配置类

  - 推荐方式：

    - public static final Singleton INSTANCE = new Singleton();

    - 或者嵌套类

      ```java
      public class Singleton {

          private Singleton() {
         }
          
          private static class Holder {
              private static Singleton instance = new Singleton();
          }
        
          public static Singleton3 getInstance() {
              return Holder.instance;
          }
      }
      ```

      ​

- ### 建造者模式

  - 将构造复杂对象的过程  和组成对象的部件解耦。
  - 使用范围：
    - 客户端给出型号，建造者模式创造复杂对象

- ### 抽象模式

- ### 原型模式



## **行为型模式**

- ### 策略模式
