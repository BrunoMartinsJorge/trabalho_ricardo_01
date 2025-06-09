package br.com.trabalho_poo.questao_01.questao_01_01;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        Calculadora calculadora = new Calculadora();
        System.out.print("\nDigite um valor: ");
        float valor1 = entrada.nextFloat();
        System.out.print("\nDigite um valor: ");
        float valor2 = entrada.nextFloat();
        int opcao = -1;
        do {
            System.out.println("Escolha uma opção de calculo: ");
            System.out.println("1 - Somar");
            System.out.println("2 - Subtração");
            System.out.println("3 - Dividir");
            System.out.println("4 - Multiplicar");
            opcao = entrada.nextInt();
        } while (opcao == -1);
        switch (opcao) {
            case 1:
                System.out.printf("A soma entre os valores %f, %f é igual a: %f", valor1, valor2, calculadora.somar(valor1, valor2));
                break;
            case 2:
                System.out.printf("A subtração entre os valores %f, %f é igual a: %f", valor1, valor2, calculadora.subtrair(valor1, valor2));
                break;
            case 3:
                System.out.printf("A divisão entre os valores %f, %f é igual a: %f", valor1, valor2, calculadora.dividir(valor1, valor2));
                break;
            case 4:
                System.out.printf("A multiplicação entre os valores %f, %f é igual a: %f", valor1, valor2, calculadora.multiplicar(valor1, valor2));
                break;
            default:
                System.out.println("Opção inválida inserida![OPÇÕES => 1 - 2 - 3 - 4]!");
                break;
        }
        entrada.close();
    }
}
