/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Admin
 */
public class principal_exer3 {
    public static void main(String[] args) {
        Tarefas t1 = new Tarefas();
        Tarefas t2 = new Tarefas();
        Tarefas t3 = new Tarefas();
        
       t1.nome = "Limpeza";
       t1.descricao = "Limpeza da garagem";
       t1.prazoConclusao = "15/05/2025";
       t1.status = "pendente";
           
       t2.nome = "Pagamento";
       t2.descricao = "Dia de pagamento dos funcionarios";
       t2.prazoConclusao = "15/06/2025";
       t2.status = "pendente";
       
       t3.nome = "Compras";
       t3.descricao = "Compra mensal da casa";
       t3.prazoConclusao = "21/09/2025";
       t3.status = "pendente";
       
       t1.concluir();
       
        System.out.println("Nome: " +t1.nome);
        System.out.println("Descricao: " + t1.descricao);
        System.out.println("Prazo: " + t1.prazoConclusao);
        System.out.println("Status da Tarefa: " +t1.status);
        System.out.println("\n");
        
        System.out.println("Nome: " +t2.nome);
        System.out.println("Descricao: " + t2.descricao);
        System.out.println("Prazo: " + t2.prazoConclusao);
        System.out.println("Status da Tarefa: " +t2.status);
        System.out.println("\n");
        
        System.out.println("Nome: " +t3.nome);
        System.out.println("Descricao: " + t3.descricao);
        System.out.println("Prazo: " + t3.prazoConclusao);
        System.out.println("Status da Tarefa: " +t3.status);
        
    }
    }    

