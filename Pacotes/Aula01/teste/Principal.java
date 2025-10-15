/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.projeto.teste;

import br.edu.etec.projeto.model.Aluno;
import br.edu.etec.projeto.model.Pessoa;
import br.edu.etec.projeto.model.Professor;
import br.edu.etec.projeto.model.Funcionario;


public class Principal {
    public static void main(String[] args) {
        
        Aluno a1 = new Aluno("123","Segundo DS","Lucas","123.456.789-10","14526398-8");
        
        System.out.println("Nome: " +a1.getNome());
        System.out.println("CPF: " +a1.getCPF());
        System.out.println("RG: " +a1.getRG());
        a1.ExibirDados();
        System.out.println("\n");
        
        
        Professor p1 = new Professor("PAM","14523685","Professor","Salomao","789.965.987-52","45896321-5");
                
        System.out.println("Nome: " +p1.getNome());
        System.out.println("CPF: " +p1.getCPF());
        System.out.println("RG: " +p1.getRG());
        p1.ExibirDados();
        System.out.println("\n");
    
        Funcionario f1 = new Funcionario("258","Auxiliar de Limpesza","Juca","569.689.745-98","554858554-5");
       
        System.out.println("Nome: " +f1.getNome());
        System.out.println("CPF: " +f1.getCPF());
        System.out.println("RG: " +f1.getRG());
        f1.ExibirDados();
        System.out.println("\n");

}
}
      
