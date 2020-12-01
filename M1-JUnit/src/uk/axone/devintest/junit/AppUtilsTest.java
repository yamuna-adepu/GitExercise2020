package uk.axone.devintest.junit;

import org.junit.Assert;
import org.junit.Test;

public class AppUtilsTest {
    AppUtils appUtils = new AppUtils();
    @Test
    public void add_test1() {


        int actResult = appUtils.add(10, 20);
        int expResult = 30;
        Assert.assertEquals(expResult, actResult);
    }

    @Test
    public void add_test2() {

        int actResult = appUtils.add(10, -20);
        int expResult = -10;
        Assert.assertEquals(expResult, actResult);
    }

    @Test
    public void multiply_test1() {

        int actResult = appUtils.multiply(10, 20);
        int expResult = 200;
        Assert.assertEquals(expResult, actResult);
    }

    @Test
    public void multiply_test2() {

        int actResult = appUtils.multiply(10, -20);
        int expResult = -200;
        Assert.assertEquals(expResult, actResult);
    }
}