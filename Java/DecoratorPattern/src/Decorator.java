public abstract class Decorator extends Beverage{
    private final Beverage childBeverage;
    public Decorator(Beverage child, double cost){
        super(cost);
        this.childBeverage = child;
    }

    @Override
    public double getCost() {
        return super.cost + childBeverage.getCost();
    }
}
