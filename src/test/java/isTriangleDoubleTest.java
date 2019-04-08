import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class isTriangleDoubleTest {
    @Parameterized.Parameter(0)
    public double a;
    @Parameterized.Parameter(1)
    public double b;
    @Parameterized.Parameter(2)
    public double c;
    @Parameterized.Parameter(3)
    public boolean expected;

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(
                new Object[]{2.0, 2.0, 3.0, true},
                new Object[]{-3.0, -2.0, -3.0, true},
                new Object[]{4.0, -2.0, 3.0, true},
                new Object[]{1.1, 2.2, 3.33, false},
                new Object[]{3.33, 2.2, 1.1, false},
                new Object[]{1.1, 3.3000001, 2.2, false},
                new Object[]{Double.MAX_VALUE, Double.MAX_VALUE, Double.MAX_VALUE, true},
                new Object[]{Double.MIN_VALUE, Double.MIN_VALUE, Double.MIN_VALUE, true},
                new Object[]{Double.MIN_VALUE, Double.MIN_VALUE, Double.MAX_VALUE, false}
                        );
    }

    @Test
    public void isTriangleDoubleShouldCheckTriangles() {

      isTriangle triangle = new isTriangle();
      boolean actual = triangle.isTriangleDouble(a, b, c);
      assertEquals(expected, actual);
    }
}
