import controller.CalculaInvestimento;
import model.Investimento;
import org.junit.Assert;
import org.junit.Test;

public class RendimentoLiquidoTest {

    @Test()
    public void calculaRendimentoLiquido60DiasE1000() {
        Investimento investimento = new Investimento(60, 1000.00, 8.5);
        CalculaInvestimento calculaInvestimento = new CalculaInvestimento(investimento);

        Double rendimentoLiquido = calculaInvestimento.calculaRendimentoLiquido();

        Assert.assertEquals(1.0829, rendimentoLiquido, 0.0001);
    }

    @Test()
    public void calculaRendimentoLiquido120DiasE500() {
        Investimento investimento = new Investimento(120, 500.00, 8.0);
        CalculaInvestimento calculaInvestimento = new CalculaInvestimento(investimento);

        Double rendimentoLiquido = calculaInvestimento.calculaRendimentoLiquido();

        Assert.assertEquals(2.0384, rendimentoLiquido, 0.0001);
    }
}
