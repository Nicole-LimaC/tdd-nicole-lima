import org.junit.Test;
import static org.junit.Assert.*;

public class ContaBancariaTest {

    @Test
    public void deveDepositarValor() {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(100);
        assertEquals(100, conta.getSaldo(), 0.001);
    }

    @Test
    public void deveSacarValor() {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(100);
        conta.sacar(40);
        assertEquals(60, conta.getSaldo(), 0.001);
    }

    @Test
    public void deveConsultarSaldoAposSaque() {
        ContaBancaria conta = new ContaBancaria();
        conta.depositar(100);
        conta.sacar(40);
        double saldo = conta.consultarSaldo();
        assertEquals(60, saldo, 0.001);
    }
}
