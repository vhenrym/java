package br.com.fiap.entities;

public class Colaborador {
    private String nome;
    private String cpf;
    private String cargo;
    private int idade;
    private double salario;
    private Endereco endereco;

    public Colaborador(){

    }

    public Colaborador(String nome, String cpf, String cargo, int idade, double salario){
        this.nome = nome;
        this.cpf = cpf;
        this.cargo = cargo;
        this.idade = idade;
        this.salario = salario;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public Endereco getEndereco() {
        return endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    @Override
    public String toString() {
        return "Colaborador{" +
                "\nnome='" + nome + '\'' +
                "\n cpf='" + cpf + '\'' +
                "\n cargo='" + cargo + '\'' +
                "\n idade=" + idade +
                "\n salario=" + salario +
                "\n endereco=" + endereco + endereco;
    }
}
