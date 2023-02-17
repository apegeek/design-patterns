package com.apegeek.design.observer;

import java.util.Date;

/**
 * 具体对象， 被观察者的状态数据
 * @author daijiang@hopechart.com
 * @version V1.0.0
 * @date 2023/2/16 14:15*
 */
public class News {

    private String id;

    private String title;

    private String content;

    public Date publishTime;

    public String author;

    public News(String id, String title, String content, Date publishTime, String author) {
        this.id = id;
        this.title = title;
        this.content = content;
        this.publishTime = publishTime;
        this.author = author;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public Date getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(Date publishTime) {
        this.publishTime = publishTime;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    @Override
    public String toString() {
        return "News{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                ", content='" + content + '\'' +
                ", publishTime=" + publishTime +
                ", author='" + author + '\'' +
                '}';
    }
}
