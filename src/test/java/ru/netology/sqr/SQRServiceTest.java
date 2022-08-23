package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class SQRServiceTest {

    @Test
    public void testExample() {
        SQRService service = new SQRService();

        int actual = service.calculate(200, 300);
        int expected = 3;

        Assertions.assertEquals(expected, actual);
    }

    @Test
    public void testWithZero() {
        SQRService service = new SQRService();

        int actual = service.calculate(100, 100);
        int expected = 1;

        Assertions.assertEquals(expected, actual);
    }
    @Test
    public void negativeTest() {
        SQRService service = new SQRService();

        int actual = service.calculate(0, 99);
        int expected = 0;

        Assertions.assertEquals(expected, actual);
    }
}
