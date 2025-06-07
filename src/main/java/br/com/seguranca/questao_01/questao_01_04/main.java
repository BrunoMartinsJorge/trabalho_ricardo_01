package br.com.seguranca.questao_01.questao_01_04;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ConverterTemperatura converterTemperatura = new ConverterTemperatura();
        int opcaoTemp;
        do {
            System.out.println("Qual tipo de conversão: ");
            System.out.println("1# -> Celsius para Fahrenheit");
            System.out.println("2# -> Fahrenheit para Celsius");
            System.out.print("Selecione a opção: ");
            opcaoTemp = entrada.nextInt();
        } while (opcaoTemp != 1 && opcaoTemp != 2);
        System.out.print("\nInsira a temperatura para ser convertida: ");
        float temperatura = entrada.nextFloat();
        if (opcaoTemp == 1)
            System.out.printf("A temperatura de %f convertida em Fahrenheit é de %f", temperatura, converterTemperatura.coverterTemperaturaParaF(temperatura));
        else
            System.out.printf("A temperatura de %f convertida em Celsius é de %f", temperatura, converterTemperatura.coverterTemperaturaParaC(temperatura));
        entrada.close();
    }
}
