package com.example.unittest;

import junit.framework.TestCase;

import org.junit.Before;
import org.junit.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.core.Is.is;

public class CalculatorTest extends TestCase {
    Calculator calculator;
    @Before
    public void setUp(){
        calculator=new Calculator(10,20);
    }

    //(timeout = 5000)>>테스트 수행 시간 제한하기
    @Test(expected = RuntimeException.class)
    public void test(){
        int resAdd=calculator.add(15, 30);
        assertThat(resAdd,is(45));
        boolean resEquals=calculator.equalTo(11,10);
        assertThat(resEquals, is(true));
    }

}