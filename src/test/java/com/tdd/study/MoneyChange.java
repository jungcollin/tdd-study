package com.tdd.study;

import com.tdd.study.tdd_1.Dollar;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class MoneyChange {

    @Test
    public void 달러변환테스트() {
        Dollar five = new Dollar(5);
        Dollar product = five.times(2);
        Assert.assertEquals(10, product.amount);
        product = five.times(3);
        Assert.assertEquals(15, product.amount);
    }
}