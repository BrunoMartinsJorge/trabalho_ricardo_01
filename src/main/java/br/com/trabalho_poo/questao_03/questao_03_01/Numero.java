package br.com.trabalho_poo.questao_03.questao_03_01;

import lombok.Data;

@Data
public class Numero {

    public int atributo;

    public void imprimir(){
        System.out.printf("O valor é de: %d\n", atributo);
    }

    @Override
    public String toString() {
        return "Numero{" +
                "atributo=" + atributo +
                '}';
    }
}
