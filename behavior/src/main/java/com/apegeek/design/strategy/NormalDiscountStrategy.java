package com.apegeek.design.strategy;

/**
 * 普通折扣
 * @author daijiang@hopechart.com
 * @version V1.0.0
 * @date 2023/2/17 10:06
 */
public class NormalDiscountStrategy implements DiscountStrategy {

    @Override
    public double discount(double price) {
        // 普通折扣, 无折扣
        System.out.println("普通折扣, 无折扣");
        return price;
    }
}

