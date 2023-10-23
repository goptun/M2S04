package atividade1;

interface Operavel {
    void depositar(double valor);

    void sacar(double valor);
}

abstract class Conta implements Operavel {
    protected double saldo;

    protected double obterSaldoAtual() {
        return saldo;
    }
}

class ContaCorrente extends Conta {
    @Override
    public void depositar(double valor) {
        saldo += valor;
    }

    @Override
    public void sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
        } else {
            System.out.println("Saldo insuficiente.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        ContaCorrente conta = new ContaCorrente();
        conta.depositar(1000.0);
        System.out.println("Saldo atual: " + conta.obterSaldoAtual());
        conta.sacar(500.0);
        System.out.println("Saldo atual: " + conta.obterSaldoAtual());
        conta.sacar(700.0);
        System.out.println("Saldo atual: " + conta.obterSaldoAtual());
    }
}
