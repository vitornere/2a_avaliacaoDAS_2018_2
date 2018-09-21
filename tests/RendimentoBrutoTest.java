import controller.CalculaInvestimento;
import model.Investimento;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class RendimentoBrutoTest {
    int dias;
    double aplicacaoInicial;
    double taxaDeJurosAnual;
    double repostaRendimentoBruto;

    public RendimentoBrutoTest(int dias, double aplicacaoInicial, double taxaDeJurosAnual, double rendimentoBruto) {
        this.dias = dias;
        this.aplicacaoInicial = aplicacaoInicial;
        this.taxaDeJurosAnual = taxaDeJurosAnual;
        this.repostaRendimentoBruto = rendimentoBruto;
    }

    @Test()
    public void calculaRendimentoBruto() {
        Investimento investimento = new Investimento(this.dias, this.aplicacaoInicial, this.taxaDeJurosAnual);
        CalculaInvestimento calculaInvestimento = new CalculaInvestimento(investimento);

        Double rendimentoBruto = calculaInvestimento.calculaRendimentoBruto();

        Assert.assertEquals(this.repostaRendimentoBruto, rendimentoBruto, 0.01);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {60, 1000.00, 8.5, 13.97},
                {120, 500.0, 8.0, 13.15},
                {240, 3000.00, 9.0, 177.53},
                {270, 2000.00, 8.5, 125.75},
                {390, 100.00, 7.5, 8.01},
                {420, 250.00, 8.0, 23.01},
                {550, 400.00, 8.0, 48.22},
                {670, 800.00, 8.0, 117.48},
                {700, 2500.00, 9.0, 431.51},
                {900, 4200.00, 9.5, 983.84},
                {1000, 100.00, 7.5, 20.55}
        });
    }

}
