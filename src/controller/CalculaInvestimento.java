package controller;

import model.Investimento;

public class CalculaInvestimento {
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
        return 3.14;
    }
}
