package Desafios.Desafio5;

public class ContaPoupanca extends ContaBancaria{
    public ContaPoupanca() {
        super();
    }

    public ContaPoupanca(double saldo) {
        super(saldo);
    }

    @Override
    public void depositar(double valor) {
        saldo = valor;
        valor = valor * taxaTransferencia;
        saldo = saldo - valor;
        System.out.println("Depositado com taxa de transferencia de 2% " + saldo);
    }
}
