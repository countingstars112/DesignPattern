package com.xxwy.Proxy;

/**
 * 代理模式：其实就是方法的增强和方法的包装
 * 我们把已经实现实例的方法，进一步的包装
 * @authon xxwy
 */
public class FoodServiceProxy implements FoodService {

    private FoodService foodService = new FoodServiceImpl();

    @Override
    public Food makeChicken() {
        System.out.println("方法增强");
        Food food = foodService.makeChicken();
        System.out.println("方法真的增强了");
        return food;
    }

    public static void main(String[] args) {
        FoodService foodService = new FoodServiceProxy();
        foodService.makeChicken();
    }
}
