package com.apegeek.design.strategy;

/**
 * 青铜折扣
 * @author daijiang@hopechart.com
 * @version V1.0.0
 * @date 2023/2/17 10:07
 */
public class BronzeDiscountStrategy implements DiscountStrategy {

    @Override
    public double discount(double price) {
        // 青铜会员, 9折
        System.out.println("青铜会员, 9折");
        return price * 0.9;
    }
}
