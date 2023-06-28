package br.edu.ifba.saj.ads.poo;

public class ContaCorrente extends Conta {
    @Override
    public void atualiza(double taxaPercentual) {
        saldo += saldo * (2 * taxaPercentual / 100);
        System.out.println("Conta corrente atualizada com sucesso. Novo saldo: " + saldo);
    }

    @Override
    public void deposita(double valor) {
        super.deposita(valor - 0.10);
        System.out.println("Taxa bancária de 10 centavos aplicada. Saldo após o depósito: " + saldo);
    }
}
