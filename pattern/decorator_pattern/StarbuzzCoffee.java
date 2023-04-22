package decorator_pattern;

public class StarbuzzCoffee {

    // Design Principle 
    // Classes should be open for extension, but closed for modification.
    
    // The Decorator Pattern: attaches additional reponsabilities to an object dynamically.
    // Decorators provide a flexible alternative to subclassing for extending fucntionality. 

    public static void main(String[] args){
        Beverage beverage = new Espresso();
        System.out.println(beverage.getDescription() + " $" + beverage.cost());

        Beverage beverage2 = new Houseblend();
        beverage2 = new Mocha(beverage2);
        beverage2 = new Mocha(beverage2);
        System.out.println(beverage2.getDescription() + " $" + beverage2.cost());
    }
}
