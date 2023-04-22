package strategy_pattern_java;

public class FlynoWay implements FlyBehavior{

    @Override
    public void fly() {
        System.out.print("I can't fly");
    }
    
}
