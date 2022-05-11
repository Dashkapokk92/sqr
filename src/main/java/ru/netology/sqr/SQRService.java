package ru.netology.sqr;

public class SQRService {
    public static void main(String[] args) {

        int firstNumberRange = 10;
        int lastNumberRange = 99;
        int lowerLimit = 150;
        int upperLimit = 500;
        CountService service = new CountService();
        System.out.println("колличество вхождений: " + service.countOfService(firstNumberRange, lastNumberRange, lowerLimit, upperLimit));

    }
}



