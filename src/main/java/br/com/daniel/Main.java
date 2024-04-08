package br.com.daniel;

import br.com.daniel.exercise1.ElectoralCount;
import br.com.daniel.exercise2.BubbleSort;
import br.com.daniel.exercise3.Fatorial;
import br.com.daniel.exercise4.SumMultiples3And5;

import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        //Exércicio 1
        System.out.println();
        System.out.println("Exercicio 1");
        var electoralCount = new ElectoralCount(1000, 800, 150, 50);
        System.out.println("Total de votos válidos " + electoralCount.getPercentageValidVotes() + "%");
        System.out.println("Total de votos em branco " + electoralCount.getPercentageBlankVotes() + "%");
        System.out.println("Total de votos nulos " + electoralCount.getPercentageNullVotes() + "%");

        //Exércicio 2
        System.out.println();
        System.out.println("Exercicio 2");
        int[] array = {6, 2, 3, 5, 8, 10, 9};
        BubbleSort.printArray(BubbleSort.bubbleSort(array));

        //Exércicio 3
        System.out.println();
        System.out.println("Exercicio 3");
        System.out.println("Fatorial: " + Fatorial.calculateFactorial(5));

        //Exércicio 4
        System.out.println();
        System.out.println("Exercicio 4");
        System.out.println("Soma: " + SumMultiples3And5.sum(List.of(4, 5, 10, 3, 6)));
    }
}