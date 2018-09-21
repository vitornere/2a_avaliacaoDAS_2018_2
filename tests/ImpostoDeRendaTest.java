import controller.CalculaInvestimento;
import model.Investimento;
import org.junit.Assert;
import org.junit.Test;

public class ImpostoDeRendaTest {

    @Test()
    public void calculaImpostoDeRenda60DiasE1000() {
        Investimento investimento = new Investimento(60, 1000.00, 8.5);
        CalculaInvestimento calculaInvestimento = new CalculaInvestimento(investimento);

        Double impostoDeRenda = calculaInvestimento.calculaImpostoDeRenda();

        Assert.assertEquals(3.14, impostoDeRenda, 0.01);
    }

    @Test()
    public void calculaImpostoDeRenda120DiasE500() {
        Investimento investimento = new Investimento(120, 500.0, 8.0);
        CalculaInvestimento calculaInvestimento = new CalculaInvestimento(investimento);

        Double impostoDeRenda = calculaInvestimento.calculaImpostoDeRenda();

        Assert.assertEquals(2.96, impostoDeRenda, 0.01);
    }
}
