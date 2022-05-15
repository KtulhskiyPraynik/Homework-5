package ru.netology.sqr;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;

public class SQRServiceTest {

    @ParameterizedTest
    @CsvFileSource(resources = {"/testnumbers.csv"})

    public void test(int minNumber, int maxNumber, int expected){
        SQRService service = new SQRService();

        int actual = service.numberRange(minNumber, maxNumber);

        Assertions.assertEquals(expected, actual);
    }
}
