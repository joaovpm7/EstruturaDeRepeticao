package com.company;

import java.util.Scanner;

public class Exerc1 {

    public static void main(String[] args){


        Scanner Scan = new Scanner(System.in);
        System.out.println("Insira um numero de 0 a 10: ");
        int nota = Scan.nextInt();


        while (nota < 0 || nota > 10){
            System.out.println("Nota invalida, repita!");
            nota = Scan.nextInt();
        }
        System.out.println("Obrigado pela avaliação!");

    }
}
