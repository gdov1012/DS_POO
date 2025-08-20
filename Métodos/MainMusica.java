/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Música;

/**
 *
 * @author Admin
 */
public class MainMusica {
    
    public static void main(String[] args) {
        Musica musica = new Musica();
        musica.nome = "Hymn for the weekend";
        musica.autor = "Coldplay";
        musica.album = "A head full of dreams";
        musica.ano = 2015;
        musica.genero = "Alternativo";
        
        musica.play();
        musica.Exibir();
        
    }
}
