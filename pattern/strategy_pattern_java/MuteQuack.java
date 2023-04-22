package strategy_pattern_java;

public class MuteQuack implements QuackBehavior{

    @Override
    public void quack() {
        System.out.println("<< silence >>");
    }
    
}
