package br.com.seguranca.questao_02;

public class SomaDiagonais {

    public void calcularDiagonalPrincipalSecundaria(int tamanho) {
        if (tamanho < 2) {
            System.out.println("Tamanho inválido, tamanho minimo é de 2X2!");
            return;
        }

        int[][] matriz = new int[tamanho][tamanho];
        int num = 0;

        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                matriz[i][j] = num;
                num++;
                System.out.print(matriz[i][j] + " ");
            }
        }

        int somaDiagonalPrincipal = 0;
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i == j) {
                    somaDiagonalPrincipal += matriz[i][j];
                }
            }
        }

        int somaDiagonalSecundaria = 0;
        for (int i = 0; i < tamanho; i++) {
            for (int j = 0; j < tamanho; j++) {
                if (i + j == tamanho - 1) {
                    somaDiagonalSecundaria += matriz[i][j];
                }
            }
        }

        System.out.printf("A soma dos elementos da diagonal principal é de %d e da secundaria é de %d", somaDiagonalPrincipal, somaDiagonalSecundaria);
    }
}
