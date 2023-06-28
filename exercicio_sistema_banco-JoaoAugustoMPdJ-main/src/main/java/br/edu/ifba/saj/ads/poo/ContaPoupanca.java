package br.edu.ifba.saj.ads.poo;

public class ContaPoupanca extends Conta {
    @Override
    public void atualiza(double taxaPercentual) {
        saldo += saldo * (3 * taxaPercentual / 100);
        System.out.println("Conta poupança atualizada com sucesso. Novo saldo: " + saldo);
    }
}