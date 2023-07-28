package the_abstract_factory_pattern;

public class PizzaTestDrive{

    public static void main(String[] args) {
        
        PizzaStore nyStore = new NYPizzaStore();
        PizzaStore chicago_Store = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Ethan orded a " + pizza.getName() + "\n");

        pizza = chicago_Store.orderPizza("cheese");
        System.out.println("Joel orded a " + pizza.getName() + "\n");
    }
}