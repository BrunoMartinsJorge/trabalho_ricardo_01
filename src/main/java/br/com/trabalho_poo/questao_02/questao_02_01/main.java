package br.com.trabalho_poo.questao_02.questao_02_01;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        MaiorMenor maiorMenor = new MaiorMenor();
        System.out.print("Digite um tamanho para o 'M' da matriz: ");
        int m = entrada.nextInt();
        System.out.print("Digite um tamanho para o 'N' da matriz: ");
        int n = entrada.nextInt();
        maiorMenor.maiorMenor(m, n);
        entrada.close();
    }
}
