package pattern.decorator.sample;

/**
 * @author UmutBayram
 */
public class Bmw implements Car {
    @Override
    public void produce() {
        System.out.println(this.getClass().getName() + " produce.");
    }
}
