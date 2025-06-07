package br.com.seguranca.questao_01;

public class ConverterTemperatura {

    public float coverterTemperaturaParaF(float temperatura){
        return (temperatura * 9/5) + 32;
    }

    public float coverterTemperaturaParaC(float temperatura){
        return (temperatura - 32) * 5/9;
    }
    //Celsius → Fahrenheit: F = (C * 9/5) + 32
    //Fahrenheit → Celsius: C = (F - 32) * 5/9
}
