/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class principal_exer2 {
    public static void main(String[] args) {
        Hospede h1 = new Hospede();
        Hospede h2 = new Hospede();
        Hospede h3 = new Hospede();
        
       h1.nome = "Isabelle";
       h1.dataCheckin = "15/05/2025";
       h1.valorQuarto = 200;
       
       h1.adicionarDia(10);
       
       h2.nome = "Roberto";
       h2.dataCheckin = "15/06/2025";
       h2.valorQuarto = 100;
       
       h2.adicionarDia(2);
       
       h3.nome = "Vaneza";
       h3.dataCheckin = "21/09/2025";
       h3.valorQuarto = 500;
       
       h3.adicionarDia(5);
       
       
        System.out.println("Nome: " +h1.nome);
        System.out.println("Valor total da Estadia: " +h1.totalEstadia);
        System.out.println("\n");
        System.out.println("Nome: " +h2.nome);
        System.out.println("Valor total da Estadia: " +h2.totalEstadia);
        System.out.println("\n");
        System.out.println("Nome: " +h3.nome);
        System.out.println("Valor total da Estadia: " +h3.totalEstadia);
        
    }
    }
}
