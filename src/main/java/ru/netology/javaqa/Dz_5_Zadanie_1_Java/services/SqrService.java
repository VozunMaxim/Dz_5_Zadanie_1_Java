package ru.netology.javaqa.Dz_5_Zadanie_1_Java.services;
import ru.netology.javaqa.Dz_5_Zadanie_1_Java.services.SqrService;

public class SqrService {
    public int calcSqr(int x, int y) {
        int count = 0;
        for (int i = 1; i <= 99; i++) {

            if (i * i < x) {
                continue;
            }
            if (i * i > y) {
                break;
            }
            count++;
        }
        return count;
    }
}