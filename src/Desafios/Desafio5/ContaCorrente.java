package Desafios.Desafio5;

public class ContaCorrente extends ContaBancaria{

    double saldoSoma;

    public ContaCorrente() {
        super();
    }

    public ContaCorrente(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        saldo = valor;

        saldo = saldo * taxaTransferencia;
        saldo = valor - saldo;
        System.out.println(saldo);
    }
}
