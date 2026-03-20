package br.com.fiap.entities;

public class Endereco {
    private String logadouro;
    private int numero;
    private String cep;
    private String complemento;
    private String estado;
    private String bairro;

    public  Endereco(){

    }

    public Endereco(String logadouro, int numero, String cep, String complemento, String estado, String bairro){
        this.logadouro = logadouro;
        this. numero = numero;
        this.cep = cep;
        this.complemento = complemento;
        this.estado = estado;
        this.bairro = bairro;
    }

    public String getLogadouro() {
        return logadouro;
    }

    public void setLogadouro(String logadouro) {
        this.logadouro = logadouro;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public String getComplemento() {
        return complemento;
    }

    public void setComplemento(String complemento) {
        this.complemento = complemento;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public String getBairro() {
        return bairro;
    }

    public void setBairro(String bairro) {
        this.bairro = bairro;
    }

    @Override
    public String toString() {
        return "Endereco{" +
                "\nlogadouro='" + logadouro + '\'' +
                "\n numero=" + numero +
                "\n cep='" + cep + '\'' +
                "\n complemento='" + complemento + '\'' +
                "\n estado='" + estado + '\'' +
                "\n bairro='" + bairro + '\'';

    }
}
