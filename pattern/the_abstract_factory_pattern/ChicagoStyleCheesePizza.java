package the_abstract_factory_pattern;

public class ChicagoStyleCheesePizza extends Pizza{
    public ChicagoStyleCheesePizza(){
        name = "Chicago Style Deep Dish Cheese Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Souce";
        toppings.add("Shredded Mozzarella cheese");
    }

    public void cut(){
        System.out.println("Cutting the pizza into square slices");
    }

}
