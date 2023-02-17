<center><span style="font-size: 30px">策略模式</span></center>

## 1. 介绍
策略模式是一种行为设计模式， 它能让你定义一系列算法， 并将每种算法分别放入独立的类中， 以使算法的对象能够相互替换。

## 2. 应用场景
策略模式是一种非常常用的设计模式，在很多不同的场景下都可以使用。以下是策略模式常见的应用场景：

- 算法多样性的情况：当一个应用中有多个算法可以选择时，可以使用策略模式将每个算法封装为一个具体策略类，从而实现算法的解耦和动态切换。

- 需要动态切换算法的情况：当应用需要动态地改变某个算法的行为时，可以使用策略模式，通过设置不同的策略对象，实现算法的动态切换。

- 避免大量的条件语句：当应用中存在大量的条件语句时，可以使用策略模式将每个条件语句封装为一个具体策略类，从而避免代码的臃肿和复杂度的提高。

- 多维度的分类条件：当需要根据多个条件对对象进行分类时，可以使用策略模式，将每个分类条件封装为一个具体策略类，从而实现分类条件的解耦和动态切换。

- 针对不同的用户需求提供不同的功能：当应用需要针对不同的用户需求提供不同的功能时，可以使用策略模式，将每种功能封装为一个具体策略类，从而实现用户需求的解耦和动态切换。

- 需要扩展性的情况：当应用需要支持新的算法或功能时，可以通过增加新的具体策略类来实现扩展，而不需要修改现有的代码。

总之，策略模式适用于需要封装算法或功能的场景，可以提高代码的复用性和灵活性，避免大量的条件语句，实现代码的解耦和动态切换。

## 3. 实现思路
策略模式是一种比较简单的设计模式，它的实现步骤如下：

1. 定义策略接口：首先需要定义一个策略接口（或抽象类），该接口中声明了一个或多个算法（或方法），具体的策略类将实现这些算法。

2. 定义具体的策略类：针对策略接口中声明的算法，实现具体的策略类，每个具体的策略类实现一种算法。

3. 定义上下文类：上下文类持有一个策略接口类型的对象，并通过调用该对象的方法来执行相应的算法。上下文类中一般会提供一个设置策略对象的方法，客户端可以通过该方法动态地改变算法的行为。

4. 编写客户端代码：客户端代码需要创建具体的策略对象，并将其设置到上下文对象中，从而改变算法的行为。

### 3.1 定义策略接口

```java
/**
 * 策略接口基类
 */
public interface Strategy {

}

/**
 * 折扣策略接口
 */
public interface DiscountStrategy extends Strategy {
    double discount(double price);
}
```

### 3.2 定义具体的策略类

```java
/**
 * 普通用户
 */
public class NormalDiscountStrategy implements DiscountStrategy {

    @Override
    public double discount(double price) {
       System.out.println("普通用户");
       return price;
    }
}

/**
 * 铜牌用户
 */
public class BronzeDiscountStrategy implements DiscountStrategy {

   @Override
   public double discount(double price) {
      System.out.println("铜牌用户");
      return price * 0.9;
   }
}

/**
 * 银牌用户
 */
public class SilverDiscountStrategy implements DiscountStrategy {

   @Override
   public double discount(double price) {
      System.out.println("银牌用户");
      return price * 0.8;
   }
}

/**
 * 金牌用户
 */
public class GoldDiscountStrategy implements DiscountStrategy {
   
   @Override
   public double discount(double price) {
      System.out.println("金牌用户");
      return price * 0.7;
   }
}
```

### 3.3 定义上下文类
上下文类持有一个策略接口类型的对象，并通过调用该对象的方法来执行相应的算法。上下文类中一般会提供一个设置策略对象的方法，客户端可以通过该方法动态地改变算法的行为。

```java
/**
 * 上下文类
 */
public class Context {
    private DiscountStrategy strategy;

    public Context(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public void setStrategy(DiscountStrategy strategy) {
        this.strategy = strategy;
    }

    public double discount(double price) {
        return strategy.discount(price);
    }
}
```

### 3.4 编写客户端代码
客户端代码通过创建具体的策略对象，并设置到上下文对象中，可以动态地改变算法的行为，从而实现了策略模式的核心功能。
```java
public class Client {
    public static void main(String[] args) {
        Context context = new Context(new NormalStrategy());
        System.out.println("普通用户折扣后的价格：" + context.discount(100));

        context.setStrategy(new BronzeStrategy());
        System.out.println("铜牌用户折扣后的价格：" + context.discount(100));

        context.setStrategy(new SilverStrategy());
        System.out.println("银牌用户折扣后的价格：" + context.discount(100));

        context.setStrategy(new GoldStrategy());
        System.out.println("金牌用户折扣后的价格：" + context.discount(100));
    }
}
```
