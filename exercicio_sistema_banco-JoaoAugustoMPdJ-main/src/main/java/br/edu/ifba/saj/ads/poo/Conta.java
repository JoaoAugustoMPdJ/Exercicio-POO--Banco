package br.edu.ifba.saj.ads.poo;

public class Conta {
    protected double saldo;

    public Conta() {
        saldo = 0.0;
    }

    public double getSaldo() {
        return saldo;
    }

    protected void deposita(double valor) {
        saldo += valor;
        System.out.println("Depósito de " + valor + " realizado com sucesso.");
    }

    public void saca(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            System.out.println("Saque de " + valor + " realizado com sucesso.");
        } else {
            System.out.println("Saldo insuficiente para realizar o saque.");
        }
    }

   /* public void atualizaConta(double taxaPercentual) {
        saldo += saldo * (taxaPercentual / 100);
        System.out.println("Conta atualizada com sucesso. Nova saldo: " + saldo);
    }*/
}