package ru.netology.sqr;

public class SQRService {

    public int numberRange(int minNumber, int maxNumber) {
        int count = 0;
        int startNumber = 10;
        int finishNumber = 99;
        for (int i = startNumber; i <= finishNumber; i++) {
            int square = i * i;
            if (square >= minNumber) {
                if (square <= maxNumber) {
                    count++;
                }
            }
        }
        return count;
    }

}