package strategy_pattern_java;

public class FlyWithWings implements FlyBehavior{

    @Override
    public void fly() {
        System.out.print("I'm flying!!");
    }
    
}
