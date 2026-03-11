public class CarTireDecorator extends CarDecorator{

    public CarTireDecorator(Car car) {
        super(car);
    }

    @Override
    public void upgrade(){
        super.upgrade();
        System.out.println("Alufelgen");
    }
}
