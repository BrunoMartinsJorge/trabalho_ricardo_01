package br.com.seguranca.questao_01;

public class Fatorial {

    public int fatorial(int numero) {
        if (numero > 0) {
            return (numero * fatorial(numero - 1));
        } else {
            return (1);
        }
    }
}
