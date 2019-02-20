#Java设计模式

##创建模式

###工厂方法模式 
  
工厂方法（FactoryMethod）模式的定义：定义一个创建产品对象的工厂接口，将产品对象的实际创建工作推迟到具体子工厂类当中。这满足创建型模式中所要求的“创建与使用相分离”的特点。 
    
工厂方法模式的主要角色如下：
* 抽象工厂（Abstract Factory）：提供了创建产品的接口，调用者通过它访问具体工厂的工厂方法 newProduct() 来创建产品。
* 具体工厂（ConcreteFactory）：主要是实现抽象工厂中的抽象方法，完成具体产品的创建。
* 抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能。
* 具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间一一对应。
    
结构图： 
![avatar](/src/main/java/com/lancq/creational_pattern/factory/factory-method.gif)
     
###抽象工厂模式
  
抽象工厂（AbstractFactory）模式的定义：是一种为访问类提供一个创建一组相关或相互依赖对象的接口，且访问类无须指定所要产品的具体类就能得到同族的不同等级的产品的模式结构。
    
抽象工厂模式是工厂方法模式的升级版本，工厂方法模式只生产一个等级的产品，而抽象工厂模式可生产多个等级的产品。 
    
使用抽象工厂模式一般要满足以下条件:
* 系统中有多个产品族，每个具体工厂创建同一族但属于不同等级结构的产品。
* 系统一次只可能消费其中某一族产品，即同族的产品一起使用。
    
抽象工厂模式的主要角色如下：
    
* 抽象工厂（Abstract Factory）：提供了创建产品的接口，它包含多个创建产品的方法 newProduct()，可以创建多个不同等级的产品。
* 具体工厂（Concrete Factory）：主要是实现抽象工厂中的多个抽象方法，完成具体产品的创建。
* 抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能，抽象工厂模式有多个抽象产品。
* 具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它 同具体工厂之间是多对一的关系。
    
结构图：

![avatar](/src/main/java/com/lancq/creational_pattern/factory/abstract-factory.gif)
          
###原型模式 

原型（Prototype）模式的定义如下：用一个已经创建的实例作为原型，通过复制该原型对象来创建一个和原型相同或相似的新对象。在这里，原型实例指定了要创建的对象的种类。用这种方式创建对象非常高效，根本无须知道对象创建的细节。例如，Windows 操作系统的安装通常较耗时，如果复制就快了很多。在生活中复制的例子非常多，这里不一一列举了。 

由于 Java 提供了对象的 clone() 方法，所以用 Java 实现原型模式很简单。

原型模式包含以下主要角色:
* 抽象原型类：规定了具体原型对象必须实现的接口。
* 具体原型类：实现抽象原型类的 clone() 方法，它是可被复制的对象。
* 访问类：使用具体原型类中的 clone() 方法来复制新的对象。

结构图：
![avatar](/src/main/java/com/lancq/creational_pattern/prototype.png) 
原型模式的克隆分为浅克隆和深克隆，Java 中的 Object 类提供了浅克隆的 clone() 方法，具体原型类只要实现 Cloneable 接口就可实现对象的浅克隆，这里的 Cloneable 接口就是抽象原型类。

###单例模式
单例（Singleton）模式的定义：指一个类只有一个实例，且该类能自行创建这个实例的一种模式。

在计算机系统中，还有 Windows 的回收站、操作系统中的文件系统、多线程中的线程池、显卡的驱动程序对象、打印机的后台处理服务、应用程序的日志对象、数据库的连接池、网站的计数器、Web 应用的配置对象、应用程序中的对话框、系统中的缓存等常常被设计成单例。

单例模式有 3 个特点：
* 单例类只有一个实例对象；
* 该单例对象必须由单例类自行创建；
* 单例类对外提供一个访问该单例的全局访问点；

单例模式的主要角色如下。
* 单例类：包含一个实例且能自行创建这个实例的类。
* 访问类：使用单例的类。

结构图：
![avatar](/src/main/java/com/lancq/creational_pattern/singleton.gif) 

创建单例模式的几种方式：
* 懒汉单例模式（线程不安全）
```java
public class LazySingleton {
    //私有静态变量
    private static LazySingleton singleton = null;

    //私有构造方法
    private LazySingleton(){}

    //获取实例
    public static LazySingleton getInstance(){
        if(singleton == null){
            try {
                Thread.sleep(100);//方便线程测试，休眠一定时间
            } catch (InterruptedException e) {
                e.printStackTrace();
            }

            singleton = new LazySingleton();
        }
        return singleton;
    }

}
```
* 懒汉（同步方法，线程安全，效率低）
```
public class LazySingleton2 {
       private static LazySingleton2 lazySingleton2 = null;
   
       private LazySingleton2(){
       }
   
       public static synchronized LazySingleton2 getInstance(){
           if( lazySingleton2 == null){
   
               try {
                   Thread.sleep(100);//方便线程测试，休眠一定时间
               } catch (InterruptedException e) {
                   e.printStackTrace();
               }
   
               lazySingleton2 = new LazySingleton2();
           }
           return lazySingleton2 ;
       }
   }
   ```
* 饿汉单例模式
* 饿汉单例模式
* 双校验锁
* 枚举单例模式
* 静态内部类
##结构模式
###适配器模式

###桥接模式

###组合模式

###装饰器模式

###门面模式

###享元模式

###代理模式

##行为模式
###观察者模式

###策略模式

###模版方法模式

##其他模式
###委托模式
###拦截过滤器模式
