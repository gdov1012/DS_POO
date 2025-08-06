/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Principal_exer1 {
    public static void main(String[] args) {
        
        Clientes c1 = new Clientes();
        Clientes c2 = new Clientes();
        Clientes c3 = new Clientes();
        
       c1.nome = "Isabelle";
       c1.email = "Isabelle@email.com";
       c1.telefone = 58745265;
       
       c1.adicionarCompra(10);
       c1.adicionarCompra(60);
       
       c2.nome = "Lucas";
       c2.email = "Lucas@email.com";
       c2.telefone = 54795215;
       
       c2.adicionarCompra(50);
       c2.adicionarCompra(60);
       
       c3.nome = "Ivy";
       c3.email = "Ivy@email.com";
       c3.telefone = 57989854;
       
       c3.adicionarCompra(20);
       c3.adicionarCompra(40);
       
       
        System.out.println("Nome: " +c1.nome);
        System.out.println("Valor total da compra: " +c1.totalCompra);
        System.out.println("\n");
        System.out.println("Nome: " +c2.nome);
        System.out.println("Valor total da compra: " +c2.totalCompra);
        System.out.println("\n");
         System.out.println("Nome: " +c3.nome);
        System.out.println("Valor total da compra: " +c3.totalCompra);
        
    }
}
