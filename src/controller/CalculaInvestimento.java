package controller;

import model.Investimento;

public class CalculaInvestimento {

    private static Double ATE_180_DIAS = 0.225;
    private static Double ATE_360_DIAS = 0.20;
    private static Double ATE_720_DIAS = 0.175;
    private static Double ACIMA_720_DIAS = 0.15;

    private static Integer E_180_DIAS = 180;
    private static Integer E_360_DIAS = 360;
    private static Integer E_720_DIAS = 720;

    private Investimento investimento;

    public CalculaInvestimento(Investimento investimento) {
        this.investimento = investimento;
    }

    public Double calculaRendimentoBruto() {
        Double aplicacaoInicial = investimento.getAplicacaoInicial();
        Double jurosDias = this.getJurosRelativoDias();

        return aplicacaoInicial * jurosDias;
    }

    private Double getJurosRelativoDias() {
        Integer dias = investimento.getDias();
        Double juros = investimento.getTaxaDeJurosAnual();
        Double diasAno = (double) dias / 365.0;
        return ( diasAno * (juros/100) );
    }

    public Double calculaImpostoDeRenda() {
        Double rendimentoBruto = calculaRendimentoBruto();
        Integer dias = investimento.getDias();

        if (dias <= E_180_DIAS) {
            return rendimentoBruto * ATE_180_DIAS;
        } else if (dias <= E_360_DIAS) {
            return rendimentoBruto * ATE_360_DIAS;
        } else if (dias <= E_720_DIAS) {
            return rendimentoBruto * ATE_720_DIAS;
        } else {
            return rendimentoBruto * ACIMA_720_DIAS;
        }
    }
}
