package br.com.fiap.main;

import br.com.fiap.entities.Colaborador;
import br.com.fiap.entities.Endereco;
import br.com.fiap.entities.Produto;

import javax.swing.*;

public class TesteSistema {

    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }

    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }

    static double real(String j){
        return Double.parseDouble((JOptionPane.showInputDialog(j)));
    }
    public static void main(String[] args) {

        Colaborador objColaborador = new Colaborador(
            texto("Nome do colaborador"),
            texto("CPF"),
            texto("Cargo"),
            inteiro("Idade"),
            real("Salario")

        );

        Endereco objEndereco = new Endereco(
                texto("Logadouro"),
                inteiro("Numero"),
                texto("CEP"),
                texto("Complemento"),
                texto("Cidade"),
                texto("Bairro")
        );


        Produto objProduto = new Produto(
            inteiro("Informações do produto\n Código"),
            texto("Tipo do produto"),
            texto("Marca"),
            real("Preço")

        );


        System.out.println( objColaborador + "" + objProduto);

    }
}
