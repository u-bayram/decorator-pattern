package pattern.decorator.sample;

public class BmwSunroof extends BmwSunroofDecorator {
    @Override
    public void produce() {
        getCar().produce();
        addSunroof();
    }

    private void addSunroof() {
        System.out.println(this.getClass().getName() + " adding.");
    }
}
