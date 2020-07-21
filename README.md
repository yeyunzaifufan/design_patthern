# 设计模式原则
## 单一职责原则
介绍：一个类应该只负责一项职责<br/>
实例：[单一职责原则](https://github.com/yeyunzaifufan/design_patthern/tree/master/src/cn/xinghaibay/principle/singleresponsibility)<br/>
注意事项：
1. 降低类的复杂度，一个类只负责一项职责
2. 提高类的可读性，可维护性
3. 降低变更引起的风险
4. 通常情况下，我们应当遵守单一职责原则，只有逻辑足够简单，才可以在代码级违反单一职责原则；只有类的方法数量足够少，可以在方法级别保持单一职责原则
## 接口隔离原则
介绍：一个类对另一个类的依赖应该建立在最小的接口上<br/>
实例：[接口隔离原则](https://github.com/yeyunzaifufan/design_patthern/tree/master/src/cn/xinghaibay/principle/segregation)
## 依赖倒置原则
介绍：
1) 高层模块不应该依赖低层模块，二者都应该依赖其抽象
2) 抽象不应该依赖细节，细节应该依赖抽象
3) 中心思想是面向接口编程
4) 设计理念：相对于细节的多变性，抽象的东西要稳定得多。以抽象为基础搭建的架构比以细节为基础的架构要稳定的多。
5) 使用接口或抽象类的目的是制定好规范，而不涉及具体的操作，把展现细节的任务交给它们的实现类去完成
实例：[依赖倒置原则](https://github.com/yeyunzaifufan/design_patthern/tree/master/src/cn/xinghaibay/principle/inversion)<br/>
依赖关系传递的三种方式：1.接口传递 2.构造方法传递 3.setter方式传递<br/>
注意事项：
1. 底层模块尽量都要有抽象类或接口
2. 变量的声明类型类型尽量时接口或抽象类
3. 继承时遵循里氏替换原则
