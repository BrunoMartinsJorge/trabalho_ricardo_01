package br.com.trabalho_poo.questao_01.questao_01_03;

public class Fatorial {

    public int fatorial(int numero) {
        if (numero > 0) {
            return (numero * fatorial(numero - 1));
        } else {
            return (1);
        }
    }
}
