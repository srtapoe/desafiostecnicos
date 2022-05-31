package br.desafios.telefone;

import java.util.Scanner;

public class Encriptado {
    public static void main(String[] args) {
        Scanner dadosEntrada = new Scanner(System.in);
        System.out.println("Digite sua expressão: ");
        String palavra = dadosEntrada.nextLine();
        StringBuilder message;
        message = new StringBuilder();

        for (int i=0; i<palavra.length(); i++) {
            char letter = palavra.charAt(i);

            if(letter == 'A' || letter == 'B' || letter == 'C') {
                letter = '2';
            } else if (letter == 'D' || letter == 'E' || letter == 'F') {
                letter = '3';
            } else if (letter == 'G' || letter == 'H' || letter == 'I') {
                letter = '4';
            } else if (letter == 'J' || letter == 'K' || letter == 'L') {
                letter = '5';
            } else if (letter == 'M' || letter == 'N' || letter == 'O') {
                letter = '6';
            } else if (letter == 'P' || letter == 'Q' || letter == 'R' || letter == 'S') {
                letter = '7';
            } else if (letter == 'T' || letter == 'U' || letter == 'V') {
                letter = '8';
            } else if (letter == 'W' || letter == 'X' || letter == 'Y' || letter == 'Z') {
                letter = '9';
            }

            message.append(letter);
        }

        System.out.println(message);
    }

}
