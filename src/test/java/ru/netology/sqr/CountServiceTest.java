package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CountServiceTest {

    @Test
    void countOfService() {
        CountService service = new CountService();
        int expected = 16;
                int actual = service.countOfService();
        Assertions.assertEquals(expected,actual);
    }
}