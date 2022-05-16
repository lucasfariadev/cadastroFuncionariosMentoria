package com.lurf.models;

public abstract class FuncionarioPJ {
    private String nome;
    private String documento;
    private Endereco endereco;
    private Integer horastrabalhadas;
    private Double valorHora;
    private Double valorRemuneracao;

    public void calculaRemuneracao() {
        this.valorRemuneracao = this.horastrabalhadas * this.valorHora;
    }

    public String getNome() {
        return nome;
    }

    public Integer getHorastrabalhadas() {
        return horastrabalhadas;
    }

    public void setHorastrabalhadas(Integer horastrabalhadas) {
        this.horastrabalhadas = horastrabalhadas;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDocumento() {
        return documento;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public Endereco getEndereco() {
        return this.endereco;
    }

    public void setEndereco(Endereco endereco) {
        this.endereco = endereco;
    }

    public Double getValorHora() {
        return valorHora;
    }

    public void setValorHora(Double valorHora) {
        this.valorHora = valorHora;
    }

    public Double getValorRemuneracao() {
        return valorRemuneracao;
    }

    public void setValorRemuneracao(Double valorRemuneracao) {
        this.valorRemuneracao = valorRemuneracao;
    }


}
