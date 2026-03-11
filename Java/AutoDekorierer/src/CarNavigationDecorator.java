public class CarNavigationDecorator extends CarDecorator{

        public CarNavigationDecorator(Car car) {
            super(car);
        }

        @Override
        public void upgrade(){
            super.upgrade();
            System.out.println("Navi");
        }
}
