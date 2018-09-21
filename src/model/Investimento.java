package model;

public class Investimento {
    private Integer dias;
    private Double aplicacaoInicial;
    private Double taxaDeJurosAnual;

    public Investimento(Integer dias, Double aplicacaoInicial, Double taxaDeJurosAnual) {
        this.dias = dias;
        this.aplicacaoInicial = aplicacaoInicial;
        this.taxaDeJurosAnual = taxaDeJurosAnual;
    }

    public Integer getDias() {
        return dias;
    }

    public void setDias(Integer dias) {
        this.dias = dias;
    }

    public Double getAplicacaoInicial() {
        return aplicacaoInicial;
    }

    public void setAplicacaoInicial(Double aplicacaoInicial) {
        this.aplicacaoInicial = aplicacaoInicial;
    }

    public Double getTaxaDeJurosAnual() {
        return taxaDeJurosAnual;
    }

    public void setTaxaDeJurosAnual(Double taxaDeJurosAnual) {
        this.taxaDeJurosAnual = taxaDeJurosAnual;
    }
}
