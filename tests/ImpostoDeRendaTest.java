import controller.CalculaInvestimento;
import model.Investimento;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

@RunWith(Parameterized.class)
public class ImpostoDeRendaTest {

    int dias;
    double aplicacaoInicial;
    double taxaDeJurosAnual;
    double repostaImpostoDeRenda;

    public ImpostoDeRendaTest(int dias, double aplicacaoInicial, double taxaDeJurosAnual, double repostaImpostoDeRenda) {
        this.dias = dias;
        this.aplicacaoInicial = aplicacaoInicial;
        this.taxaDeJurosAnual = taxaDeJurosAnual;
        this.repostaImpostoDeRenda = repostaImpostoDeRenda;
    }

    @Test()
    public void calculaImpostoDeRenda60DiasE1000() {
        Investimento investimento = new Investimento(this.dias, this.aplicacaoInicial, this.taxaDeJurosAnual);
        CalculaInvestimento calculaInvestimento = new CalculaInvestimento(investimento);

        Double impostoDeRenda = calculaInvestimento.calculaImpostoDeRenda();

        Assert.assertEquals(this.repostaImpostoDeRenda, impostoDeRenda, 0.01);
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][] {
                {60, 1000.00, 8.5, 3.14},
                {120, 500.0, 8.0, 2.96},
                {240, 3000.00, 9.0, 35.51},
                {270, 2000.00, 8.5, 25.15},
                {390, 100.00, 7.5, 1.40},
                {420, 250.00, 8.0, 4.03},
                {550, 400.00, 8.0, 8.44},
                {670, 800.00, 8.0, 20.56},
                {700, 2500.00, 9.0, 75.51},
                {900, 4200.00, 9.5, 147.58},
                {1000, 100.00, 7.5, 3.08}
        });
    }
}
