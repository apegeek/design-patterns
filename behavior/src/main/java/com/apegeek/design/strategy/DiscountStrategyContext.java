package com.apegeek.design.strategy;

/**
 * 策略模式 - 上下文
 *
 * @author daijiang@hopechart.com
 * @version V1.0.0
 * @date 2023/2/17 10:09
 */
public class DiscountStrategyContext {

    private DiscountStrategy discountStrategy;

    public DiscountStrategyContext(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }

    public double discount(double price) {
        return discountStrategy.discount(price);
    }

    public void setDiscountStrategy(DiscountStrategy discountStrategy) {
        this.discountStrategy = discountStrategy;
    }
}
