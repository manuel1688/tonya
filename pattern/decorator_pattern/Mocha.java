//__ The Decorator Pattern: attaches additional responsabilities 
//to an object dynamically. Decorators provide a flexible alternative to subclassing for extending functionality.

package decorator_pattern;

public class Mocha extends CondimentDecorator {

    private Beverage beverage;

    public Mocha(Beverage beverage){
        this.beverage = beverage;
    }

    @Override
    public String getDescription() {
        return this.beverage.getDescription() + ", Mocha";
    }

    public double cost(){
        return beverage.cost() + 0.20;
    }
    
}
