package br.com.trabalho_poo.questao_01.questao_01_02;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Palindromo palindromo = new Palindromo();
        String palindromoString;
        System.out.print("\nDigite uma palavra: ");
        palindromoString = entrada.next();
        System.out.print("\nA palavra" + palindromo.verificarPalindromo(palindromoString));
        entrada.close();
    }
}
