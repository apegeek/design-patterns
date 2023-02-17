package com.apegeek.design.strategy;

/**
 *
 * @author daijiang@hopechart.com
 * @version V1.0.0
 * @date 2023/2/17 10:04
 */
public interface DiscountStrategy extends Strategy {
    /**
     * 折扣
     * @param price
     * @return
     */
    double discount(double price);
}
