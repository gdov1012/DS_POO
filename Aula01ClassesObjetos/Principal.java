/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Principal {
    public static void main(String[] args) {
        //criando objeto
        Pessoa pessoa1 = new Pessoa();
        Pessoa pessoa2 = new Pessoa();
        Pessoa pessoa3 = new Pessoa();
        
        pessoa1.nome = "Giovanna";
        pessoa1.idade = 16;
        pessoa1.RG = "123456";
        
        pessoa2.nome = "Lucas";
        pessoa2.idade = 28;
        pessoa2.RG = "654321";
        
        pessoa3.nome = "Isabelle";
        pessoa3.idade = 9;
        pessoa3.RG = "578458";
        
        //exibir infos
       
        System.out.println("Pessoa 1: ");
        pessoa1.exibirInfos();
        System.out.println("\n");
        System.out.println("Pessoa 2: ");
        pessoa2.exibirInfos();
         System.out.println("\n");
        System.out.println("Pessoa 3: ");
        pessoa3.exibirInfos();
      }
}
