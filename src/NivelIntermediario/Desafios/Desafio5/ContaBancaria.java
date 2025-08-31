package NivelIntermediario.Desafios.Desafio5;

public abstract class ContaBancaria implements Conta{
    double saldo;
    double taxaTransferencia = 0.02;

    public ContaBancaria() {
    }

    public ContaBancaria(double saldo) {
        this.saldo = saldo;
    }

    @Override
    public void consultarSaldo() {
        System.out.println("Saldo atual: " + this.saldo);
    }

    @Override
    public abstract void depositar(double valor);
}
