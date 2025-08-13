/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
class Conta {
    String nomeCliente;
    double saldo;
    double saldoInicial;
    
    public void depositar(double valor){
        if(valor > 0){
            saldo += valor;
            System.out.println("Deposito de R$ " + valor + " realizado com sucesso!");
        }else{
            System.out.println("Valor invalido para deposito!");
        }        
    }

    public void sacar(double valor){
        if(valor > 0 && valor <= saldo){
            saldo += valor;
            System.out.println("Saque de R$ " + valor + " realizado com sucesso!");
        }else{
            System.out.println("Saldo insuficiente ou valor invalido!");
        }        
    }
      public void transferir(Conta destino, double valor){
        if(valor > 0 && valor <= saldo){
            saldo -= valor;
            destino.saldo += valor;
            
            System.out.println("Tranferencia de R$ " + valor + " para " + destino.nomeCliente + " realizada com sucesso!");
        }else{
            System.out.println("Saldo insuficiente ou valor invalido para transferencia!");
        }        
    }
 
}
