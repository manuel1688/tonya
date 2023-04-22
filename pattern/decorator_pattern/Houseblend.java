package decorator_pattern;

public class Houseblend extends Beverage{

    public Houseblend(){
        description = "House Blend";
    }

    @Override
    public double cost() {
        return 0.89;
    }
    
}
