/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.projeto.teste;

import br.edu.etec.projeto.model.Aluno;
import br.edu.etec.projeto.model.Pessoa;
import br.edu.etec.projeto.model.Professor;
import br.edu.etec.projeto.model.Funcionario;
import javax.swing.JOptionPane;


public class Principal {
    public static void main(String[] args) {
        
            String nomeA = JOptionPane.showInputDialog("Digite o nome do aluno:");
            String CPFA = JOptionPane.showInputDialog("Digite o CPF do aluno:");
            String RGA = JOptionPane.showInputDialog("Digite o RG do aluno:");
            String RGM = JOptionPane.showInputDialog("Digite o RGM do aluno:");
            String turma = JOptionPane.showInputDialog("Digite a Turma do aluno:");
            
             Aluno a1 = new Aluno(RGM, turma, nomeA, CPFA, RGA);
             
          JOptionPane.showMessageDialog(null,
                "Nome: " + a1.getNome() + "\n" +
                "CPF: " + a1.getCPF() + "\n" +
                "RG: " + a1.getRG()+ "\n" +
                "RA: " + a1.getRGM()  + "\n" +
                "turma: " +a1.getTurma() );
 
   
        
            String nomeP = JOptionPane.showInputDialog("Digite o nome do Professor:");
            String CPFP = JOptionPane.showInputDialog("Digite o CPF do Professor:");
            String RGP = JOptionPane.showInputDialog("Digite o RG do Professor:");
            String disciplina = JOptionPane.showInputDialog("Digite o disciplina do Professor:");
            String RFP = JOptionPane.showInputDialog("Digite a RF do Professor:");
            String cargoP = JOptionPane.showInputDialog("Digite o cargo:");
            
             Professor p1 = new Professor(RFP,cargoP,disciplina, nomeP, CPFP, RGP);
             
          JOptionPane.showMessageDialog(null,
                "Nome: " + p1.getNome() + "\n" +
                "CPF: " + p1.getCPF() + "\n" +
                "RG: " + p1.getRG()+ "\n" +
                "RF: " + p1.getRF()  + "\n" +
                "cargo: " +p1.getCargo() );
 
          
          
            String nomeF = JOptionPane.showInputDialog("Digite o nome do Professor:");
            String CPFF = JOptionPane.showInputDialog("Digite o CPF do Professor:");
            String RGF = JOptionPane.showInputDialog("Digite o RG do Professor:");
            String RF = JOptionPane.showInputDialog("Digite a RF do Professor:");
            String cargo = JOptionPane.showInputDialog("Digite o cargo:");
            
             Funcionario f1 = new Funcionario(RF,cargo, nomeF, CPFF, RGF);
             
          JOptionPane.showMessageDialog(null,
                "Nome: " + p1.getNome() + "\n" +
                "CPF: " + p1.getCPF() + "\n" +
                "RG: " + p1.getRG()+ "\n" +
                "RF: " + p1.getRF()  + "\n" +
                "cargo: " +p1.getCargo() );
   
    
    

}
}
      
