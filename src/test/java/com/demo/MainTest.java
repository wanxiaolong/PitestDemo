package com.demo;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class MainTest {
    private Main main = new Main();

    @Test
    public void calculate_shouldSuccess() {
        int result = main.calculate(100);
        assertEquals(5050, result);//1+2+3+...+100=5050
    }

    @Test
    public void calculate_shouldSuccess2() {
        int result = main.calculate(2);
        assertEquals(3, result);//1+2=3
    }

    @Test
    public void calculate_shouldThrowException_whenNumberIsInvalid() {
        RuntimeException e = assertThrows(RuntimeException.class, () -> {
            main.calculate(1);
        });
        assertEquals("Number should be greater than 1", e.getMessage());
    }
}
