import org.junit.Assert;
import org.junit.Test;

public class RendimentoBrutoTest {

    @Test()
    public void calculaRendimentoBruto() {
        Investimento investimento = new Investimento(60, 1000.00);
        CalculaInvestimento calculaInvestimento = new CalculaInvestimento(investimento);

        Double rendimentoBruto = calculaInvestimento.calculaRendimentoBruto();

        Assert.assertEquals(13.97, rendimentoBruto, 0.01);
    }
}
