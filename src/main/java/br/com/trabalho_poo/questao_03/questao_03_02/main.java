package br.com.trabalho_poo.questao_03.questao_03_02;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ValorContainer objA = new ValorContainer();
        ValorContainer objB = new ValorContainer();
        System.out.print("\nDigite um valor: ");
        objA.valor = entrada.nextInt();
        System.out.print("Digite um valor: ");
        objB.valor = entrada.nextInt();
        entrada.close();
        System.out.println("Valor objA: " + objA.valor);
        System.out.println("Valor objB: " + objB.valor);
        ValorContainer.trocarValores(objA, objB);
        System.out.println("Valor trocado objA: " + objA.valor);
        System.out.println("Valor trocado objB: " + objB.valor);
        entrada.close();
    }
}
