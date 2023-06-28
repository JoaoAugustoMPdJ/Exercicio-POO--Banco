package br.edu.ifba.saj.ads.poo;

public class AtualizadorDeContas {
    protected double saldoTotal = 0;
    protected double selic;
    public AtualizadorDeContas(double selic) {
        this.selic = selic;
    }
     public void roda(Conta c) {
        System.out.println("Saldo Anterior: " + c.getSaldo());
        c.atualizaConta(this.selic);
        System.out.println("Saldo Final: " + c.getSaldo());
        saldoTotal += c.getSaldo();
    }

    public double getSaldoTotal() {
        return saldoTotal;
    }
}