package strategy_pattern_java;



public abstract class Duck{

    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;

    Duck(){
        
    }

    public abstract void display();

    public void performQuack(){
        this.quackBehavior.quack();
    }

    public void performFly(){
        this.flyBehavior.fly();
    }

    public void setFlyBehavior(FlyBehavior fb){
        flyBehavior = fb;
    }

    public void setQuackBehavior(QuackBehavior qb){
        quackBehavior = qb;
    }
    
}