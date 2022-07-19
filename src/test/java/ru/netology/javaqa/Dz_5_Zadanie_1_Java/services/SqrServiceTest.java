package ru.netology.javaqa.Dz_5_Zadanie_1_Java.services;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvFileSource;
//import ru.netology.javaqa.Dz_5_Zadanie_1_Java.services.SqrService;

public class SqrServiceTest {

    @ParameterizedTest
    @CsvFileSource(files = "src/test/resources/sqr.csv")
    public void shouldCalcExact(int x, int y) {
        SqrService service = new SqrService();

        int expected = service.calcSqr(x, y);
        int actual = service.calcSqr(x, y);

        Assertions.assertEquals(expected, actual);
    }
}