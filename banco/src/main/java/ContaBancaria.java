public class ContaBancaria {

    private double saldo;

    public void depositar(double valor) {
        saldo += valor;
    }

    public void sacar(double valor) {
        if (valor > saldo) {
            return;
        }
        saldo = saldo - valor;
    }

    public double getSaldo() {
        return saldo;
    }
}
