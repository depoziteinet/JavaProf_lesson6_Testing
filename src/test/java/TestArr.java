import org.junit.Assert;
import org.junit.Test;

public class TestArr {

    @Test
    public void test11() {
        int[] arrInt = {1, 2, 5, 2, 3, 4};
        int[] arrafter = {};
        Assert.assertArrayEquals(arrafter, Arrays1.after4(arrInt));
    }

    @Test
    public void test12() {
        int[] arrInt = {1, 2, 5, 2, 3, 4, 3, 6, 7, 8, 9, 0};
        int[] arrafter = {3, 6, 7, 8, 9, 0};
        Assert.assertArrayEquals(arrafter, Arrays1.after4(arrInt));
    }

    @Test
    public void test13() {
        int[] arrInt = {1, 4, 5, 2, 3, 4, 3, 1};
        int[] arrafter = {3, 1};
        Assert.assertArrayEquals(arrafter, Arrays1.after4(arrInt));
    }

    @Test(expected = Exception.class)
    public void test14() {
        int[] arrInt = {1, 2, 5, 2, 3, 3, 3, 3, 3, 3, 3, 3, 3, 3};
        int[] arrafter = {};
        Assert.assertArrayEquals(arrafter, Arrays1.after4(arrInt));
    }
}