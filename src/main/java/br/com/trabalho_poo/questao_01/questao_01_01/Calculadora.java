package br.com.trabalho_poo.questao_01.questao_01_01;

import lombok.Data;

@Data
public class Calculadora {

    private Integer num;

    public float somar(float a, float b) {
        return a + b;
    }

    public float subtrair(float a, float b) {
        return a - b;
    }

    public float multiplicar(float a, float b) {
        return a * b;
    }

    public float dividir(float a, float b) {
        return a / b;
    }

    public Calculadora() { }
}
