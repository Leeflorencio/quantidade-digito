package com.br.mercado.dao;

import java.util.Scanner;

public class QuantidadeDigito {

    public static int digitos(int number) {
        String numberAsString = Integer.toString(number);
        return numberAsString.length();
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Digite o número: ");
        int number = sc.nextInt();

        int digitCount = digitos(number);
        System.out.println("O número " + number + " possui " + digitCount + " dígitos.");
    }
}
