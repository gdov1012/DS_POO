/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.projeto.model;

/**
 *
 * @author Admin
 */
public class Aluno extends Pessoa {
   private String RGM;
   private String turma;

    public Aluno(String RGM, String turma, String nome, String CPF, String RG) {
        super(nome, CPF, RG);
        this.RGM = RGM;
        this.turma = turma;
    }
 
   public void ExibirDados(){
            
            System.out.println("RGM: " +RGM);
            System.out.println("Turma: " +turma);

  
        }

    public String getRGM() {
        return RGM;
    }

    public void setRGM(String RGM) {
        this.RGM = RGM;
    }

    public String getTurma() {
        return turma;
    }

    public void setTurma(String turma) {
        this.turma = turma;
    }
   }

