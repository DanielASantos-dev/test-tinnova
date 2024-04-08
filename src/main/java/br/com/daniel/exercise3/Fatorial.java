package br.com.daniel.exercise3;

public class Fatorial {

    public static int calculateFactorial(int number) {
        if (number <= 1) {
            return 1;
        } else {
            return number * calculateFactorial(number - 1);
        }
    }
}
