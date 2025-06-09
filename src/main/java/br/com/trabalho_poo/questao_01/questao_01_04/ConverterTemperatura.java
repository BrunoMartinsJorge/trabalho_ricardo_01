package br.com.trabalho_poo.questao_01.questao_01_04;

public class ConverterTemperatura {

    public float coverterTemperaturaParaF(float temperatura){
        return (temperatura * 9/5) + 32;
    }

    public float coverterTemperaturaParaC(float temperatura){
        return (temperatura - 32) * 5/9;
    }
}
