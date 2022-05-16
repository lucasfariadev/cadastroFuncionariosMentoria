package com.lurf.models;

public class Gerente extends FuncionarioPJ implements CalculaBonificacao {
    private Double valorBonificacao;

    @Override
    public void calculaBonificacao(Double porcentagemBonificacao) {
        this.valorBonificacao = (super.getValorRemuneracao() * (porcentagemBonificacao)) + 100d;
    }

    @Override
    public String toString() {
        return "FuncionarioPJ{" +
                "nome='" + super.getNome() + '\'' +
                ", documento='" + super.getDocumento() + '\'' +
                ", endereco=" + super.getEndereco().getBairro() +
                ", horastrabalhadas=" + super.getHorastrabalhadas() +
                ", valorHora=" + super.getValorHora() +
                ", valorRemuneração=" + super.getValorRemuneracao() +
                ", valorBonificação" + this.valorBonificacao +
                '}';
    }


}
