public class Main {
    public static void main(String[] args) {
        Beverage b = new Milk(new Whip(new Expresso()));
        System.out.println(b.getCost());
    }
}