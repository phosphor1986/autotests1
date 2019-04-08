import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;


@RunWith(Parameterized.class)
public class isTriangleIntTest {
    @Parameterized.Parameter(0)
    public int a;
    @Parameterized.Parameter(1)
    public int b;
    @Parameterized.Parameter(2)
    public int c;
    @Parameterized.Parameter(3)
    public boolean expected;

    @Parameterized.Parameters
    public static Collection<Object[]> parameters() {
        return Arrays.asList(
                new Object[]{2, 2, 3, true},
                new Object[]{-3, -2, -3, true},
                new Object[]{40, -20, 30, true},
                new Object[]{110, 220, 333, false},
                new Object[]{333, 220, 110, false},
                new Object[]{110, 331, 220, false},
                new Object[]{Integer.MAX_VALUE, Integer.MAX_VALUE, Integer.MAX_VALUE, false},
                new Object[]{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MIN_VALUE, true},
                new Object[]{Integer.MIN_VALUE, Integer.MIN_VALUE, Integer.MAX_VALUE, false}       );
    }

    @Test
    public void isTriangleIntShouldCheckTriangles() {

        isTriangle triangle = new isTriangle();
        boolean actual = triangle.isTriangleInt(a, b, c);
        assertEquals(expected, actual);
    }
}
