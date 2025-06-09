package br.com.trabalho_poo.questao_03.questao_03_01;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Numero num = new Numero();
        System.out.print("\nDigite um numero: ");
        num.atributo = entrada.nextInt();
        num.imprimir();
        System.out.print(System.identityHashCode(num.toString().hashCode()));
        entrada.close();
    }
}
