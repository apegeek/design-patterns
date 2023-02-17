package com.apegeek.design.observer;

/**
 * 具体被观察者
 * @author daijiang@hopechart.com
 * @version V1.0.0
 * @date 2023/2/16 14:14
 * @copyright
 */
public class NewsSubject implements Subject {

    private News news;

    @Override
    public void registerObserver(Observer o) {
        observers.add(o);
    }

    @Override
    public void removeObserver(Observer o) {
        observers.remove(o);
    }

    @Override
    public void notifyObservers() {
        for (Observer observer : observers) {
            observer.update(this);
        }
    }

    public News getNews() {
        return news;
    }

    public void setNews(News news) {
        this.news = news;
        notifyObservers();
    }
}
