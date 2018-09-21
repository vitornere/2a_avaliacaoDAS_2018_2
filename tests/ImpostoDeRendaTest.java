import controller.CalculaInvestimento;
import model.Investimento;
import org.junit.Assert;
import org.junit.Test;

public class ImpostoDeRendaTest {

    @Test()
    public void calculaImpostoDeRenda() {
        Investimento investimento = new Investimento(60, 1000.00, 8.5);
        CalculaInvestimento calculaInvestimento = new CalculaInvestimento(investimento);

        Double impostoDeRenda = calculaInvestimento.calculaImpostoDeRenda();

        Assert.assertEquals(3.14, impostoDeRenda, 0.01);
    }
}
