package br.com.seguranca.questao_03;

import lombok.Data;

@Data
public class Numero {

    public int atributo;

    public void imprimir(){
        System.out.println(atributo);
    }

    @Override
    public String toString() {
        return "Numero{" +
                "atributo=" + atributo +
                '}';
    }
}
