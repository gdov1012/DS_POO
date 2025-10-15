/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.projeto.model;

/**
 *
 * @author Admin
 */
public class Pessoa {
       
        private String nome;
        private String CPF;
        private String RG;
        
        public Pessoa(String nome,String CPF,String RG){
            this.nome = nome;
            this.CPF = CPF;
            this.RG = RG;
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCPF() {
        return CPF;
    }

    public void setCPF(String CPF) {
        this.CPF = CPF;
    }

    public String getRG() {
        return RG;
    }

    public void setRG(String RG) {
        this.RG = RG;
    }
   }   
