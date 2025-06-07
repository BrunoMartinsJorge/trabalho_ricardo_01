package br.com.seguranca.questao_01.questao_01_03;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Fatorial fatorial = new Fatorial();
        int valorFat;
        do {
            System.out.print("Digite um valor para ser calculado o fatorial: ");
            valorFat = entrada.nextInt();
        } while (valorFat <= 0);
        System.out.printf("\nO valor do fatorial de %d é de %d", valorFat, fatorial.fatorial(valorFat));
        entrada.close();
    }
}
