/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Música;

/**
 *
 * @author Admin
 */

    public class  Musica {
    String nome;
    String autor;
    String album;
    String genero;
    int ano;
    
    public void play(){
        System.out.println("A musica esta tocando");
    }
    
    public void stop(){
        System.out.println("A musica parou");
    }
    
    public void pular(){
        System.out.println("a musuca foi pulada");
        
    }
    public void Exibir(){
        System.out.println("------Sistema de gerenciamento de Musica -------");
        System.out.println("Nome da musica: " +nome );
        System.out.println("Autor da musica: " +autor );
        System.out.println("Album da musica: " +album);
        System.out.println("Genero da musica: " +genero);
        System.out.println("Ano de Pulblicacao da musica: " +ano );
    }
}

