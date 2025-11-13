/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 55119
 */
public class Programa {

    public static void main(String[] args) {

        //selecionar um dia da semana
        DiaDaSemana dia = DiaDaSemana.QUINTA;

        // Exibir mensagem com base no dia escolhido
        switch (dia) {
            case SEGUNDA:
                System.out.println("Hoje eh segunda-feira!");
                break;
            case TERCA:
                System.out.println("Hoje eh terca-feira!");
                break;
            case QUARTA:
                System.out.println("Hoje eh quarta-feira!");
                break;
            case QUINTA:
                System.out.println("Hoje eh quinta-feira!");
                break;
            case SEXTA:
                System.out.println("Hoje eh sexta-feira!");
                break;
            case SABADO:
                System.out.println("Hoje eh sabado!");
                break;
            case DOMINGO:
                System.out.println("Hoje eh domingo!");
                break;
        }

        // Mostrar todos os dias usando values()
        System.out.println("\nLista completa dos dias da semana:");
        for (DiaDaSemana d : DiaDaSemana.values()) {
            System.out.println(d);
        }
    }
}


