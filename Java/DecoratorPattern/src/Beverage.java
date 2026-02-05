public abstract class Beverage {
    double cost;

    public Beverage(double cost){this.setCost(cost);}

    public void setCost(double cost){this.cost = cost;}

    public abstract double getCost();
}