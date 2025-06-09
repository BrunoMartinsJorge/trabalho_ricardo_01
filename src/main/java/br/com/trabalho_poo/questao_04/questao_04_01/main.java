package br.com.trabalho_poo.questao_04.questao_04_01;

import java.util.ArrayList;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ArrayList<Funcionario> listaFuncionarios = new ArrayList<>();
        int qtd;
        System.out.print("\nQuantos funcionarios quer adicionar: ");
        qtd = entrada.nextInt();
        for (int i = 0; i < qtd; i++) {
            Funcionario funcionario = new Funcionario();
            System.out.print("\nDigite o nome do funcionario: ");
            funcionario.setNome(entrada.next());
            System.out.print("\nDigite o ID do funcionario: ");
            funcionario.setId(entrada.nextInt());
            System.out.print("\nDigite o salario do funcionario: ");
            funcionario.setSalario(entrada.nextDouble());
            System.out.print("\nDigite o departamento do funcionario: ");
            funcionario.setDepartamento(entrada.next());
            listaFuncionarios.add(funcionario);
        }
        String departamentoEspecifico;
        System.out.print("\nEscolha um departamento: ");
        departamentoEspecifico = entrada.next();
        double somaSalario = 0;
        for (Funcionario funcionario : listaFuncionarios) {
            if (funcionario.getDepartamento().equals(departamentoEspecifico)) {
                somaSalario += funcionario.getSalario();
            }
        }
        System.out.printf("A soma dos salários é de %.2f", somaSalario);
        System.out.println("\nLista de funcionarios: ");
        for (Funcionario funcionario : listaFuncionarios) {
            System.out.println("Nome: " + funcionario.getNome());
            System.out.println("ID: " + funcionario.getId());
            System.out.println("Salario: " + funcionario.getSalario());
            System.out.println("Departamento: " + funcionario.getDepartamento());
            System.out.println("\n");
        }
        entrada.close();
    }
}
