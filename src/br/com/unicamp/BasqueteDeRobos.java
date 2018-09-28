package br.com.unicamp;

import java.util.Scanner;

public class BasqueteDeRobos {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe a distancia: ");
        Integer distancia = scanner.nextInt();

        Integer pontos = 0;

        if (distancia <= 800) {
            pontos = 1;
        } else if (distancia > 800 && distancia <= 1400) {
            pontos = 2;
        } else if (distancia > 1400 && distancia <= 2000) {
            pontos = 3;
        } else {
            pontos = 0;
        }

        System.out.print("Pontos: " + pontos);
    }
}
