public class ContaBancaria {

    private double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > saldo) return;
        saldo -= valor;
    }

    public double getSaldo() {
        return saldo;
    }

    public double consultarSaldo() {
        return saldo;
    }
}
