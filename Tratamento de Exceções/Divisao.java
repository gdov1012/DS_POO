
import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author 55119
 */
public class Divisao {
    
public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite o numero numerador: ");
        int numerador = entrada.nextInt();

        System.out.print("Digite o numero denominador: ");
        int denominador = entrada.nextInt();

        try {
            // Tentativa de divisão
            // Se o denominador for zero, ocorre a exceção ArithmeticException
            int resultado = numerador / denominador;

            System.out.println("O resultado da divisao eh: " + resultado);

        } catch (ArithmeticException e) {
            // Captura da exceção
            // ArithmeticException aparece quando ocorre divisão por zero
            System.out.println("Erro: Nao eh possivel dividir por zero!");

        }

       
    }
}


