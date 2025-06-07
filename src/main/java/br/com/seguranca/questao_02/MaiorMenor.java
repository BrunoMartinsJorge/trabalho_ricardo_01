package br.com.seguranca.questao_02;

public class MaiorMenor {

    public void maiorMenor(int m, int n){
        int[][] matriz = new int[m][n];
        int num = 0;
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                matriz[i][j] = num;
                num++;
            }
        }

        int maior = matriz[0][0];
        int menor = matriz[0][0];
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(matriz[i][j] > maior)
                    maior = matriz[i][j];
                if(matriz[i][j] < menor)
                    menor = matriz[i][j];
            }
        }

        System.out.printf("O maior elemento é %d e o menor é %d", maior, menor);
    }
}
