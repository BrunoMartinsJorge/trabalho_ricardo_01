package br.com.seguranca.questao_04.questao_04_02;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Contato> listaContatos = new ArrayList<>();
        int qtd2;
        do {
            System.out.print("\nQuantos quer adicionar?: (MAX: 10) ");
            qtd2 = entrada.nextInt();
        } while (qtd2 < 1 || qtd2 > 10);
        for (int i = 0; i < qtd2; i++) {
            Contato contato = new Contato();
            System.out.print("\nDigite o email do contato: ");
            contato.setEmail(entrada.next());
            System.out.print("\nDigite o nome do contato: ");
            contato.setNome(entrada.next());
            System.out.print("\nDigite o telefone do contato: ");
            contato.setTelefone(entrada.next());
            listaContatos.add(contato);
        }
        System.out.println("\nListar todos os contatos: ");
        for (Contato contato : listaContatos) {
            System.out.println("Email: " + contato.getEmail());
            System.out.println("Nome: " + contato.getNome());
            System.out.println("Telefone: " + contato.getTelefone());
        }
        String nomeBusca;
        do {
            System.out.print("\nNome para buscar contato: ");
            nomeBusca = entrada.next();
        } while (nomeBusca.isEmpty());
        for (Contato contato : listaContatos) {
            if (contato.getNome().equals(nomeBusca)) {
                System.out.println(contato.getEmail());
                System.out.println(contato.getTelefone());
            }
        }
    }
}
