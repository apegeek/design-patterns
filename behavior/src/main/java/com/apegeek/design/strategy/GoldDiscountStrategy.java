package com.apegeek.design.strategy;

/**
 * 黄金折扣
 *
 * @author daijiang@hopechart.com
 * @version V1.0.0
 * @date 2023/2/17 10:08
 */
public class GoldDiscountStrategy implements DiscountStrategy {

    @Override
    public double discount(double price) {
        // 黄金会员, 7.5折
        System.out.println("黄金会员, 7.5折");
        return price * 0.75;
    }
}
