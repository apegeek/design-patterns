package com.apegeek.design.strategy;

/**
 * 策略模式 - 客户端
 *
 * @author daijiang@hopechart.com
 * @version V1.0.0
 * @date 2023/2/17 10:09
 */
public class Client {

    public static void main(String[] args) {
        DiscountStrategyContext discountStrategyContext = new DiscountStrategyContext(new NormalDiscountStrategy());
        System.out.println(discountStrategyContext.discount(100));
        System.out.println("====================================");
        discountStrategyContext.setDiscountStrategy(new BronzeDiscountStrategy());
        System.out.println(discountStrategyContext.discount(100));
        System.out.println("====================================");
        discountStrategyContext.setDiscountStrategy(new SilverDiscountStrategy());
        System.out.println(discountStrategyContext.discount(100));
        System.out.println("====================================");
        discountStrategyContext.setDiscountStrategy(new GoldDiscountStrategy());
        System.out.println(discountStrategyContext.discount(100));
    }
}
