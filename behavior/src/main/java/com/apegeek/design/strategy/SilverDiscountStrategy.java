package com.apegeek.design.strategy;

/**
 * 白银折扣
 * @author daijiang@hopechart.com
 * @version V1.0.0
 * @date 2023/2/17 10:07
 */
public class SilverDiscountStrategy implements DiscountStrategy {

    @Override
    public double discount(double price) {
        // 白银会员, 8折
        System.out.println("白银会员, 8折");
        return price * 0.8;
    }
}
