/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.projeto.model;

/**
 *
 * @author Admin
 */
public class Funcionario extends Pessoa {
    private String RF;
    private String cargo;

    public Funcionario(String RF, String cargo, String nome, String CPF, String RG) {
        super(nome, CPF, RG);
        this.RF = RF;
        this.cargo = cargo;
    }
    
    public void ExibirDados(){
            System.out.println("RF: " +RF);
            System.out.println("Cargo: " +cargo);

  
        }

    public String getRF() {
        return RF;
    }

    public void setRF(String RF) {
        this.RF = RF;
    }

    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }
}
