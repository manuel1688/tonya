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
