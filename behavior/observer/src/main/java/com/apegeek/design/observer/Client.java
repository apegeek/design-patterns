package com.apegeek.design.observer;

import java.util.Date;

/**
 * @author daijiang@hopechart.com
 * @version V1.0.0
 * @date 2023/2/16 14:22
 */
public class Client {

    public static void main(String[] args) {
        NewsSubject newsSubject = new NewsSubject();
        newsSubject.registerObserver(new NewsObserver("张三"));
        newsSubject.registerObserver(new NewsObserver("李四"));
        newsSubject.registerObserver(new NewsObserver("王五"));

        newsSubject.setNews(new News("1", "军事新闻", "俄乌战争进入关键阶段", new Date(), "王五"));
    }
}
