/*----------------------------------------------------------------------------------------
 * Copyright (c) Microsoft Corporation. All rights reserved.
 * Licensed under the MIT License. See LICENSE in the project root for license information.
 *---------------------------------------------------------------------------------------*/

package br.edu.ifba.saj.ads.poo;

public class App {
    
    public static void main(String[] args) {
       // testaContas();
        
       AtualizadorDeContas atualizador = new AtualizadorDeContas(5.0);

        ContaCorrente contaCorrente = new ContaCorrente();
        contaCorrente.deposita(1000.0);

        ContaPoupanca contaPoupanca = new ContaPoupanca();
        contaPoupanca.deposita(2000.0);

        atualizador.roda(contaCorrente);
        atualizador.roda(contaPoupanca);

        System.out.println("Saldo Total do Banco: " + atualizador.getSaldoTotal());


    }
}

   /*  private static void testaContas(){
        Conta c = new Conta();
        ContaCorrente cc = new ContaCorrente();
        ContaPoupanca cp = new ContaPoupanca();
        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        c.atualiza(0.01);
        cc.atualiza(0.01);
        cp.atualiza(0.01);
        System.out.println(c.getSaldo());
        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());
    }

    private static void testaAtualizadorDeContas (){
        Conta c = new Conta();
        Conta cc = new ContaCorrente();
        Conta cp = new ContaPoupanca();
        c.deposita(1000);
        cc.deposita(1000);
        cp.deposita(1000);
        AtualizadorDeContas adc = new AtualizadorDeContas(0.01);
        adc.roda(c);
        adc.roda(cc);
        adc.roda(cp);
        System.out.println("Saldo Total: " + adc.getSaldoTotal());
    }
}*/
