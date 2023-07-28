package the_abstract_factory_pattern;

public class ChicagoPizzaStore extends PizzaStore{

    @Override
    protected Pizza createPizza(String type) {
        if(type.equals("cheese")){
            return new ChicagoStyleCheesePizza();
        } else if(type.equals("veggie")){
            return new ChicagoStyleVeggiePizza();
        }
        else if(type.equals("clam")){
            return new ChicagoStyleClamPizza();
        }
        else if(type.equals("pepperoni")){
            return new ChicagoStylePepperoniPizza();
        }else{
            return null;
        }
    }

}
