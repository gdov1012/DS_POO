/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class principal_exer5 {
      public static void main(String[] args) {
        Carro c1 = new Carro();
        Carro c2 = new Carro();
        Carro c3 = new Carro();
        
       c1.modelo = "Fusion";
       c1.valorAluguel = 450;
       
       c1.adicionarDia(22);
       
       c2.modelo = "Onix";
       c2.valorAluguel = 200;
       
       c2.adicionarDia(2);
       
       c3.modelo = "C4 lounge";
       c3.valorAluguel = 350;
       
       c3.adicionarDia(10);
       
       
        System.out.println("Modelo: " +c1.modelo);
        System.out.println("Valor diaria do Aluguel: " +c1.valorAluguel);
        System.out.println("Valor total: " +  c1.valorTotal);
        System.out.println("\n");
        
        System.out.println("Modelo: " +c2.modelo);
        System.out.println("Valor diaria do Aluguel: " +c2.valorAluguel);
        System.out.println("Valor total: " +  c2.valorTotal);
        System.out.println("\n");
        
        System.out.println("Modelo: " +c3.modelo);
        System.out.println("Valor diario do Aluguel: " +c3.valorAluguel);
        System.out.println("Valor total: " +  c3.valorTotal);
        System.out.println("\n");
    }
    }

