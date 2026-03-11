public class Main {
    public static void main(String[] args) {
        Car full = new CarNavigationDecorator(new CarTireDecorator(new BMW()));
        full.upgrade();
    }
}