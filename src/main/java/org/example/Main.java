package org.example;

import entities.PagadorImposto;
import entities.PessoaFisica;
import entities.PessoaJuridica;

import java.util.ArrayList;
import java.util.Locale;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        ArrayList<PagadorImposto> pagadorImpostos = new ArrayList<>();

        System.out.print("Entre com a quantidade de contribuinte: ");
        int qtdPagadorImposto = sc.nextInt();


        for (int i = 0; i < qtdPagadorImposto; i++) {
            System.out.println("Contribuinte #" + (i + 1));
            System.out.print("Nome: ");
            String nome = sc.nextLine();
            sc.nextLine();
            System.out.print("Pessoa fisica ou juridica (F/J)");
            String tiposPagador = sc.next();

            System.out.print("Renda anual: ");
            double renda = sc.nextDouble();

            if (tiposPagador.equalsIgnoreCase("f")) {
                System.out.println("Gastos com saude: ");
                double gastoSaude = sc.nextDouble();
                pagadorImpostos.add(new PessoaFisica(nome, renda, gastoSaude));
            } else {
                System.out.println("quantidade de funcionarios: ");
                int qtdFuncionario = sc.nextInt();
                pagadorImpostos.add(new PessoaJuridica(nome, renda, qtdFuncionario));
            }

        }

        for (PagadorImposto pagador: pagadorImpostos) {
            System.out.println(pagador);
        }
    }
}