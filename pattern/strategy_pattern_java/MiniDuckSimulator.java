//Design Principle: 
//__ Identify the aspects of your application that vary and separate them from what stays the same.
//__ Program to an interface, not an implemetation
//__ Favor composition over inheritance

//__ The Strategy Pattern: defines a family of algorithms, encapsulates each one, and makes them interchangeable.abstract. 
// Strategy lets the algorithm vary independently from clients that use it.

package strategy_pattern_java;

public class MiniDuckSimulator {

    public static void main(String[] args){
        Duck mallard = new MallardDuck();
        Quack quack = new Quack();
        mallard.setQuackBehavior(quack);
        mallard.performQuack();
        FlyWithWings fly = new FlyWithWings();
        mallard.setFlyBehavior(fly);
        mallard.performFly();
    }
    
}
