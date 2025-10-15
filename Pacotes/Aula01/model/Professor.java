/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.projeto.model;

/**
 *
 * @author Admin
 */
public class Professor extends Funcionario{
    private String disciplina;

    public Professor(String disciplina, String RF, String cargo, String nome, String CPF, String RG) {
        super(RF, cargo, nome, CPF, RG);
        this.disciplina = disciplina;
    }

    
    @Override
    public void ExibirDados(){
            System.out.println("Disciplina: " +disciplina);
            
        }

    public String getDisciplina() {
        return disciplina;
    }

    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }

   
}
