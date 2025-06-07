package br.com.seguranca.questao_03;

public class ValorContainer {

    public int valor;

    public static void trocarValores(ValorContainer refA, ValorContainer refB){
        int valorA = refA.valor;
        int valorB = refB.valor;
        refB.valor = valorA;
        refA.valor = valorB;
    }
}
