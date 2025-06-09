package br.com.trabalho_poo.questao_03.questao_03_02;

public class ValorContainer {

    public int valor;

    public static void trocarValores(ValorContainer refA, ValorContainer refB){
        int valorA = refA.valor;
        int valorB = refB.valor;
        refB.valor = valorA;
        refA.valor = valorB;
    }
}
