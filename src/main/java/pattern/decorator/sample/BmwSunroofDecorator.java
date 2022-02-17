package pattern.decorator.sample;

/**
 * @author UmutBayram
 */
public abstract class BmwSunroofDecorator implements Car{
    private Car car = new Bmw();

    public Car getCar() {
        return car;
    }

    public void setCar(final Car car) {
        this.car = car;
    }
}
