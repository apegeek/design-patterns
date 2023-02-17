package com.apegeek.design.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * 被观察者
 * @author daijiang@apegeek.com
 * @version V1.0.0
 * @date 2023/2/16 14:12
 */
public interface Subject {
    /**
     * 观察者列表
     */
    List<Observer> observers = new ArrayList<>();

    /**
     * 注册观察者
     *
     * @param o
     */
    void registerObserver(Observer o);

    /**
     * 移除观察者
     *
     * @param o
     */
    void removeObserver(Observer o);

    /**
     * 通知观察者
     */
    void notifyObservers();
}
