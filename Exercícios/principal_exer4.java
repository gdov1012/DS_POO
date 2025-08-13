/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class principal_exer4 {
    public static void main (String[] args)
    {
        Conta c1 = new Conta();
        Conta c2 = new Conta();
        
        c1.nomeCliente = "Maria ";
        c1.saldo = 0;
        c1.saldoInicial = 1000;
        
        c2.nomeCliente = "Joao";
        c2.saldo = 0;
        c2.saldoInicial = 950;
        
        c1.depositar(1000);
        c1.sacar(200);
        c1.transferir(c2,300);
        
        System.out.println("\n");
        System.out.println("Saldo Inicial de " + c1.nomeCliente + ": R$ " + c1.saldoInicial);
        System.out.println("Saldo final de " + c1.nomeCliente + ": R$ " + c1.saldo);
        System.out.println("\n");
        System.out.println("Saldo Inicial de " + c2.nomeCliente + ": R$ " + c2.saldoInicial);
        System.out.println("Saldo final de " + c2.nomeCliente + ": R$ " + c2.saldo);
        System.out.println("\n");
    }
}


