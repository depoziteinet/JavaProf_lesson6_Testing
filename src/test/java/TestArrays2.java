import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class TestArrays2 {
    private boolean isTrue;
    private int[] arr;

    public TestArrays2(boolean isTrue, int[] arr) {
        this.isTrue = isTrue;
        this.arr = arr;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {true, new int[]{4, 1, 1, 1}},
                {true, new int[]{4, 1, 4, 1}},
                {false, new int[]{1, 1, 1, 1}},
                {false, new int[]{4, 4, 4, 4}},
                {false, new int[]{4, 3, 1, 1}},
        });
    }

    @Test
    public void test21() {
        Assert.assertEquals(isTrue, Arrays2.isOneAndFour(arr));
    }
}



