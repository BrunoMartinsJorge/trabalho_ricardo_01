package br.com.trabalho_poo.questao_02.questao_02_02;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        SomaDiagonais somaDiagonais = new SomaDiagonais();
        int tamanho;
        System.out.print("\nDigite o tamanho da matriz: ");
        tamanho = entrada.nextInt();
        somaDiagonais.calcularDiagonalPrincipalSecundaria(tamanho);
        entrada.close();
    }
}
