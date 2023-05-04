
import org.example.MetricCalculator;
import org.junit.Test;
import org.junit.jupiter.api.Assertions;

public class MetricCalculatorTest {

    private final MetricCalculator metricCalculator = new MetricCalculator();


    @Test
    public void testAddition() {
        String result = metricCalculator.addition(3, "km", 40, "dm");
        String expected = "30040.0 dm";
        Assertions.assertEquals(result, expected);
    }

    @Test
    public void testSubtraction() {
        String result = metricCalculator.subtraction(2, "cm", 10, "mm");
        String expected = "10.0 mm";

        Assertions.assertEquals(result, expected);
    }

}

