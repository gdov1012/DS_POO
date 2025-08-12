/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class Tarefas {
    String nome;
    String descricao;
    String prazoConclusao;
    String status;
    
       
    public void concluir(){
        status = "conluido";
         }
    public void pendente(){
        status = "pendente";
         }
}
