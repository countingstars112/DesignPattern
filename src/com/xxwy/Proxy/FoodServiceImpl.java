package com.xxwy.Proxy;

/**
 * @authon xxwy
 */
public class FoodServiceImpl implements FoodService{
    @Override
    public Food makeChicken() {
        Food food = new Food();
        food.setName("炸鸡");
        food.setSalt("100g");
        return food;
    }
}
