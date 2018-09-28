package br.com.unicamp;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class AlbumDaCopa {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe o total de figurinhas: ");
        Integer totalDeFigurinhas = scanner.nextInt();

        System.out.print("Informe o número de figurinhas compradas: ");
        Integer numerosDeFigurinhasCompradas = scanner.nextInt();

        Set<Integer> figurinhas = new HashSet<>();
        Integer figurinhaComprada = 0;
        while (figurinhaComprada < numerosDeFigurinhasCompradas) {
            System.out.print("Informe o número da figurinha ("+ (figurinhaComprada+1) +") comprada: ");
            figurinhas.add(scanner.nextInt());
            figurinhaComprada++;
        }

        System.out.println("Figurinhas faltantes: "+ (totalDeFigurinhas - figurinhas.size()));
    }
}
