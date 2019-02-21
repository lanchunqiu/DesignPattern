# Java设计模式

## 创建模式

### 工厂方法模式 
  
工厂方法（FactoryMethod）模式的定义：定义一个创建产品对象的工厂接口，将产品对象的实际创建工作推迟到具体子工厂类当中。这满足创建型模式中所要求的“创建与使用相分离”的特点。 
    
工厂方法模式的主要角色如下：
* 抽象工厂（Abstract Factory）：提供了创建产品的接口，调用者通过它访问具体工厂的工厂方法 newProduct() 来创建产品。
* 具体工厂（ConcreteFactory）：主要是实现抽象工厂中的抽象方法，完成具体产品的创建。
* 抽象产品（Product）：定义了产品的规范，描述了产品的主要特性和功能。
* 具体产品（ConcreteProduct）：实现了抽象产品角色所定义的接口，由具体工厂来创建，它同具体工厂之间一一对应。
    
结构图： 
![avatar](/src/main/java/com/lancq/creational_pattern/factory/factory-method.gif)
     
### 抽象工厂模式
  
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
          
### 原型模式 

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
* 懒汉单例模式（同步方法，线程安全，效率低）
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
```java
public class HungarySingleton {
    private static HungarySingleton singleton = new HungarySingleton();
    private HungarySingleton(){
    }
    public static HungarySingleton getInstance(){
        return singleton;
    }
}
```
* 饿汉单例模式(静态代码块)
```java
public class HungarySingleton2 {
    private static HungarySingleton2 singleton = null;

    static {
        singleton = new HungarySingleton2();
    }

    private HungarySingleton2(){
    }

    public static HungarySingleton2 getInstance(){
        return singleton;
    }
}
```
* 双校验锁
```java
public class DuplicationCheckSingleton {
    //volatile屏蔽指令重排的语义在JDK1.5中才被修复
    //在此前的JDK中即使变量被声明为volatile也不能完全避免指令重排所导致的问题，这也是在JDK1.5之前的Java中无法安全的使用DCL来实现单例的原因！！
    private static volatile DuplicationCheckSingleton singleton = null;

    private DuplicationCheckSingleton(){}

    public static DuplicationCheckSingleton getInstance(){
        if(singleton == null){//1

            synchronized (DuplicationCheckSingleton.class){
                if(singleton == null){//2
                    singleton = new DuplicationCheckSingleton();
                }
            }
        }

        return singleton;
    }
}
```
* 枚举单例模式
```java
public enum EnumSingleton {
    INSTANCE;

    private Resource resource = null;
    EnumSingleton(){
        resource = new Resource();
    }
} 

```
```java
public class Resource {
    private int rid = 1;
    public int getRid(){
        return this.rid;
    }
}
```
```java
public class EnumSingletonTest extends Thread{
	
	public static void main(String[] args){
		EnumSingletonTest[] mts = new EnumSingletonTest[100];  
        for(int i = 0 ; i < mts.length ; i++){  
            mts[i] = new EnumSingletonTest();  
        }  
          
        for (int j = 0; j < mts.length; j++) {  
            mts[j].start();  
        } 
	}
	
	@Override  
	public void run() {   
	    System.out.println(EnumSingleton.INSTANCE.getResource().hashCode());
	} 
}
```
* 静态内部类
```java
public class StaticFinalInnerClassSingleton {
    //静态内部类
    private static class SingletonHolder{
        private static final StaticFinalInnerClassSingleton INSTANCE = new StaticFinalInnerClassSingleton();
    }
    //私有构造方法
    private StaticFinalInnerClassSingleton(){}

    public static StaticFinalInnerClassSingleton getInstance(){
        return SingletonHolder.INSTANCE;
    }
}
```

##结构模式
###适配器模式
适配器模式（Adapter）的定义如下：将一个类的接口转换成客户希望的另外一个接口，使得原本由于接口不兼容而不能一起工作的那些类能一起工作。
适配器模式分为`类适配器模式`和`对象适配器模式`两种，前者类之间的耦合度比后者高，且要求程序员了解现有组件库中的相关组件的内部结构，所以应用相对较少些。

该模式的主要优点如下：
* 客户端通过适配器可以透明地调用目标接口。
* 复用了现存的类，程序员不需要修改原有代码而重用现有的适配者类。
* 将目标类和适配者类解耦，解决了目标类和适配者类接口不一致的问题。

其缺点是：对类适配器来说，更换适配器的实现过程比较复杂。

`类适配器模式`可采用多重继承方式实现，如 C++ 可定义一个适配器类来同时继承当前系统的业务接口和现有组件库中已经存在的组件接口；Java不支持多继承，但可以定义一个适配器类来实现当前系统的业务接口，同时又继承现有组件库中已经存在的组件。

`对象适配器模式`可釆用将现有组件库中已经实现的组件引入适配器类中，该类同时实现当前系统的业务接口。现在来介绍它们的基本结构。

适配器模式（Adapter）包含以下主要角色:
* 目标（Target）接口：当前系统业务所期待的接口，它可以是抽象类或接口。
* 适配者（Adaptee）类：它是被访问和适配的现存组件库中的组件接口。
* 适配器（Adapter）类：它是一个转换器，通过继承或引用适配者的对象，把适配者接口转换成目标接口，让客户按目标接口的格式访问适配者。

类适配器模式结构图：
![avatar](/src/main/java/com/lancq/structure_pattern/adapter/class-adapter.gif) 

对象适配器模式结构图：
![avatar](/src/main/java/com/lancq/structure_pattern/adapter/object-adapter.gif) 

###桥接模式
桥接（Bridge）模式的定义如下：将抽象与实现分离，使它们可以独立变化。它是用组合关系代替继承关系来实现，从而降低了抽象和实现这两个可变维度的耦合度。

桥接（Bridge）模式的优点是：
* 由于抽象与实现分离，所以扩展能力强；
* 其实现细节对客户透明。

缺点是：由于聚合关系建立在抽象层，要求开发者针对抽象化进行设计与编程，这增加了系统的理解与设计难度。

桥接（Bridge）模式包含以下主要角色:
* **抽象化（Abstraction）角色**：定义抽象类，并包含一个对实现化对象的引用。
* **扩展抽象化（Refined Abstraction）角色**：是抽象化角色的子类，实现父类中的业务方法，并通过组合关系调用实现化角色中的业务方法。
* **实现化（Implementor）角色**：定义实现化角色的接口，供扩展抽象化角色调用。
* **具体实现化（Concrete Implementor）角色**：给出实现化角色接口的具体实现。

结构图：
![avatar](/src/main/java/com/lancq/structure_pattern/bridge/bridge.gif)

###组合模式
组合（Composite）模式的定义：有时又叫作部分-整体模式，它是一种将对象组合成树状的层次结构的模式，用来表示“部分-整体”的关系，使用户对单个对象和组合对象具有一致的访问性。

组合模式的主要优点有：
* 组合模式使得客户端代码可以一致地处理单个对象和组合对象，无须关心自己处理的是单个对象，还是组合对象，这简化了客户端代码；
* 更容易在组合体内加入新的对象，客户端不会因为加入了新的对象而更改源代码，满足“开闭原则”；

其主要缺点是：
* 设计较复杂，客户端需要花更多时间理清类之间的层次关系；
* 不容易限制容器中的构件；
* 不容易用继承的方法来增加构件的新功能；

组合模式包含以下主要角色：
* **抽象构件（Component）角色**：它的主要作用是为树叶构件和树枝构件声明公共接口，并实现它们的默认行为。在透明式的组合模式中抽象构件还声明访问和管理子类的接口；在安全式的组合模式中不声明访问和管理子类的接口，管理工作由树枝构件完成。
* **树叶构件（Leaf）角色**：是组合中的叶节点对象，它没有子节点，用于实现抽象构件角色中 声明的公共接口。
* **树枝构件（Composite）角色**：是组合中的分支节点对象，它有子节点。它实现了抽象构件角色中声明的接口，它的主要作用是存储和管理子部件，通常包含 Add()、Remove()、GetChild() 等方法。

组合模式分为`透明式的组合模式`和`安全式的组合模式`。

* **透明方式**：在该方式中，由于抽象构件声明了所有子类中的全部方法，所以客户端无须区别树叶对象和树枝对象，对客户端来说是透明的。但其缺点是：树叶构件本来没有 Add()、Remove() 及 GetChild() 方法，却要实现它们（空实现或抛异常），这样会带来一些安全性问题。
* **安全方式**：在该方式中，将管理子构件的方法移到树枝构件中，抽象构件和树叶构件没有对子对象的管理方法，这样就避免了上一种方式的安全性问题，但由于叶子和分支有不同的接口，客户端在调用时要知道树叶对象和树枝对象的存在，所以失去了透明性。

结构图：
![avatar](/src/main/java/com/lancq/structure_pattern/composite/Composite_Design_Pattern_UML.jpg)


### 装饰器模式
装饰器（Decorator）模式的定义：指在不改变现有对象结构的情况下，动态地给该对象增加一些职责（即增加其额外功能）的模式，它属于对象结构型模式。

装饰（Decorator）模式的主要优点有：
* 采用装饰模式扩展对象的功能比采用继承方式更加灵活。
* 可以设计出多个不同的具体装饰类，创造出多个不同行为的组合。

其主要缺点是：装饰模式增加了许多子类，如果过度使用会使程序变得很复杂。

装饰模式主要包含以下角色：
* **抽象构件（Component）角色**：定义一个抽象接口以规范准备接收附加责任的对象。
* **具体构件（ConcreteComponent）角色**：实现抽象构件，通过装饰角色为其添加一些职责。
* **抽象装饰（Decorator）角色**：继承抽象构件，并包含具体构件的实例，可以通过其子类扩展具体构件的功能。
* **具体装饰（ConcreteDecorator）角色**：实现抽象装饰的相关方法，并给具体构件对象添加附加的责任。

结构图：
![avatar](/src/main/java/com/lancq/structure_pattern/decorator/Decorator_Design_Pattern_UML.jpg)

### 外观（门面）模式
外观（Facade）模式的定义：是一种通过为多个复杂的子系统提供一个一致的接口，而使这些子系统更加容易被访问的模式。该模式对外有一个统一接口，外部应用程序不用关心内部子系统的具体的细节，这样会大大降低应用程序的复杂度，提高了程序的可维护性。

外观（Facade）模式是“迪米特法则”的典型应用，它有以下主要优点：
* 降低了子系统与客户端之间的耦合度，使得子系统的变化不会影响调用它的客户类。
* 对客户屏蔽了子系统组件，减少了客户处理的对象数目，并使得子系统使用起来更加容易。
* 降低了大型软件系统中的编译依赖性，简化了系统在不同平台之间的移植过程，因为编译一个子系统不会影响其他的子系统，也不会影响外观对象。

外观（Facade）模式的主要缺点如下：
* 不能很好地限制客户使用子系统类。
* 增加新的子系统可能需要修改外观类或客户端的源代码，违背了“开闭原则”。

外观（Facade）模式的结构比较简单，主要是定义了一个高层接口。它包含了对各个子系统的引用，客户端可以通过它访问各个子系统的功能。

外观（Facade）模式包含以下主要角色：
* **外观（Facade）角色**：为多个子系统对外提供一个共同的接口。
* **子系统（SubSystem）角色**：实现系统的部分功能，客户可以通过外观角色访问它。
* **客户（Client）角色**：通过一个外观角色访问各个子系统的功能。

结构图：

![avatar](/src/main/java/com/lancq/structure_pattern/facade/facade.gif)

### 享元模式

### 代理模式

## 行为模式
### 观察者模式

### 策略模式

###模版方法模式

##其他模式
###委托模式
###拦截过滤器模式
