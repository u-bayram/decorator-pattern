package pattern.decorator.sample;

import org.junit.jupiter.api.Test;

public class DecoratorTest {

    @Test
    public void test() {
        Car car = new BmwSunroof();
        car.produce();
    }
}
