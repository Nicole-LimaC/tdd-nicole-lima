import org.junit.Test;
import static org.junit.Assert.*;

public class ContaBancariaTest {

    @Test
    public void deveDepositarValor() {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(100);
        assertEquals(100, conta.getSaldo(), 0.001);
    }
}
