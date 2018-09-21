import controller.CalculaInvestimento;
import model.Investimento;
import org.junit.Assert;
import org.junit.Test;

public class RendimentoBrutoTest {

    @Test()
    public void calculaRendimentoBruto60DiasE1000() {
        Investimento investimento = new Investimento(60, 1000.00);
        CalculaInvestimento calculaInvestimento = new CalculaInvestimento(investimento);

        Double rendimentoBruto = calculaInvestimento.calculaRendimentoBruto();

        Assert.assertEquals(13.97, rendimentoBruto, 0.01);
    }

    @Test()
    public void calculaRendimentoBruto120DiasE500() {
        Investimento investimento = new Investimento(120, 500.0);
        CalculaInvestimento calculaInvestimento = new CalculaInvestimento(investimento);

        Double rendimentoBruto = calculaInvestimento.calculaRendimentoBruto();

        Assert.assertEquals(13.15, rendimentoBruto, 0.01);
    }
}
