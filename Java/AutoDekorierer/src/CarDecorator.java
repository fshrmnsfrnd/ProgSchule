public abstract class CarDecorator implements Car{
    private Car car;

    public CarDecorator(Car car) {
        this.car = car;
    }

    public void upgrade(){
        this.car.upgrade();
    };
}
