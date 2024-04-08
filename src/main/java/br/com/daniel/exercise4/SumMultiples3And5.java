package br.com.daniel.exercise4;

import java.util.List;

public class SumMultiples3And5  {

    public static int sum(List<Integer> numbers) {
        Integer sum = 0;
        for (Integer num: numbers){
            if (num % 3 == 0 || num % 5 == 0){
                sum+=num;
            }
        }
        return sum;
    }

}
