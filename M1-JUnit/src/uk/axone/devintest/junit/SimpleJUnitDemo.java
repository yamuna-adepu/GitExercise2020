package uk.axone.devintest.junit;

import org.junit.Ignore;
import org.junit.Test;

public class SimpleJUnitDemo {
    @Test
    public void test1() {
        startTest();
        System.out.println("Running test 1");
    }

    @Test
    public void test2() {
        startTest();
        System.out.println("Running test 2");
    }

    @Ignore
    public void test3() {
        startTest();
        System.out.println("Running test 3");
    }
    private void startTest(){
        System.out.println("Starting test");
    }
}