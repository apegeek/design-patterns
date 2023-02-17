package com.apegeek.design.observer;

/**
 * 具体观察者
 * @author daijiang@hopechart.com
 * @version V1.0.0
 * @date 2023/2/16 14:21
 */
public class NewsObserver implements Observer {

    private String name;

    public NewsObserver(String name) {
        this.name = name;
    }

    @Override
    public void update(Subject subject) {
        System.out.println(name + "收到了新闻：" +  ((NewsSubject) subject).getNews().toString());
    }
}
