<center><span style="font-size: 30px">观察者模式</span></center>

## 1. 介绍
观察者模式（Observer Pattern）是一种常见的设计模式，其主要能力是让对象（被观察者）与其他对象（观察者）之间建立一种一对多的依赖关系，以便当被观察者的状态发生改变时，所有依赖它的对象都能够自动地得到通知并更新。
具体而言，观察者模式包含以下角色：

- 被观察者（Subject）：它是一个抽象类或接口，定义了一系列方法来添加、删除和通知观察者。通常它会包含一个观察者列表用于存储所有依赖它的观察者对象。
- 观察者（Observer）：它是一个接口或抽象类，定义了一系列方法，用于接收被观察者发来的通知，并根据通知更新自己的状态。
- 具体被观察者（ConcreteSubject）：它是被观察者的具体实现，通常包含一个状态属性，以及实现添加、删除和通知观察者的方法。
- 具体观察者（ConcreteObserver）：它是观察者的具体实现，它包含一个或多个状态属性，并实现接收通知并更新自己状态的方法。

观察者模式的主要能力在于解耦，即将被观察者与观察者之间的依赖关系分离开来，使得它们可以独立地变化。当被观察者的状态发生改变时，观察者不需要知道具体发生了什么变化，只需要知道有变化发生了即可。这种解耦可以使得系统更加灵活，易于扩展和维护。同时，观察者模式也可以降低系统的耦合度，因为它遵循了依赖倒置原则（Dependency Inversion Principle），即依赖于抽象，而不是依赖于具体实现。

## 2. 实现思路

1. 定义一个抽象主题（Subject）类，其中包括用于添加、删除和通知观察者的方法。
    ```java
    public abstract class Subject {
        private List<Observer> observers = new ArrayList<>();
    
        public void addObserver(Observer observer) {
            observers.add(observer);
        }
    
        public void removeObserver(Observer observer) {
            observers.remove(observer);
        }
    
        public void notifyObservers() {
            for (Observer observer : observers) {
                observer.update(this);
            }
        }
    }
    ```
2. 定义一个抽象观察者（Observer）类，其中包括用于接收通知并更新自己状态的方法。
   ```java
   public abstract class Observer { 
       public abstract void update(Subject subject);
   }
   ```
3. 定义一个具体主题（ConcreteSubject）类，它是抽象主题类的具体实现，包含一个观察者列表，用于存储所有依赖它的观察者对象，以及一个状态属性，用于存储被观察者的状态。
   它还包含一个用于添加观察者的方法，一个用于删除观察者的方法，以及一个用于通知观察者的方法。
   ```java
    public class ConcreteSubject extends Subject {
        private int data;
        public int getData() {
            return data;
        }
   
        public void setData(int data) {
            this.data = data;
            notifyObservers();
        }
    }
    ```    


4. 定义具体观察者（ConcreteObserver）类，该类继承自抽象观察者类，并实现具体的业务逻辑。在接收到主题通知时，更新自身状态。
   ```java
   public class ConcreteObserver extends Observer {
       private int observerState;

       @Override
       public void update(Subject subject) {
           ConcreteSubject concreteSubject = (ConcreteSubject) subject;
           observerState = concreteSubject.getData();
           // 执行更新操作
       }
   }
   ```
