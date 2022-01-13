# Spring框架学习笔记

## 1 Bean的作用域与生命周期

### 1.1 Bean的作用域

默认情况下，拿到的Bean都是**单例**的。所谓单例，就是一个类只有一个实体。

#### 1.1.1 singleton作用域

默认情况下，被管理的Bean都是单例的，被调用时只会返回同一个Bean

![img](file:///C:\Users\75230\Documents\Tencent Files\2724226853\Image\C2C\A44A076A356CC282667565EBEA02E071.jpg)

默认情况下，Bean对象在Spring启动时就会创建，lazyinit属性规定对应的Bean对象不会在初始情况下创建，而是被调用时才创建。

容器在启动的情况下，就实例化所有的单例作用域的Bean对象，并缓存在容器中。



**不设置懒加载(lazy-init为true)的好处：**

1）在Spring创建初始，就会建立Bean对象，如果出现错误会直接报错。提前发现问题

2）如果懒加载，那么每次在第一次调用的时候就会很慢，运行效率下降



**什么对象适合作为单例对象？**

对象是无状态，或者状态不可改变的对象适合单例。比如：controller层，service层，dao层，都是适合单例对象的例子。而user，message就不适合，因为user有很多个，message每次请求都在改变。



#### 1.1.2 prototype作用域

![img](file:///C:\Users\75230\Documents\Tencent Files\2724226853\Image\C2C\57883157C7BED605F1FC8E475D70233A.jpg)

原型作用域的意思是，设置了scope为prototype的bean，不会放置到缓存池中，而是每次调用时，都会创建一个新的Bean

### 1.2 Bean的生命周期

Bean的生命周期包括：定义，初始化，使用，销毁，四个阶段。

#### 1.2.1 Bean的定义

用配置文件定义Bean

#### 1.2.2 Bean的初始化

默认情况下，IOC容器加载时候初始化

初始化有两种方式：

第一种：在类中建立一个初始化方法，然后在配置文件中标注这个bean的初始化方法是什么。用init-method属性来标注。

第二种：实现InitializingBean接口，使用其中的afterPropertiesSet()方法

#### 1.2.3 Bean的销毁

类似初始化，也可以指定销毁时调用的方法，使用destroy属性来规定即可，然后通过AbstractApplicationContext对象来构建bean的缓存池，调用close方法实现bean的销毁过程。

