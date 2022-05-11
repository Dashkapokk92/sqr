package ru.netology.sqr;

public class CountService {
    public int countOfService(int firstNumberRange,int lastNumberRange, int lowerLimit,int upperLimit){
        int count =0;
        for (int i = firstNumberRange; i<=lastNumberRange; i++ ){
            if (lowerLimit <=i*i && i*i <=upperLimit){
                System.out.print( "***i = " + i + ", i**2 = " + i*i + "\n");
                count++;
            }
        }
        return count;
    }

}

