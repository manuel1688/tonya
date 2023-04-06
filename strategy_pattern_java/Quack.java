package strategy_pattern_java;

public class Quack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.print("Quack");   
    }
    
}
