/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package palindromo;

/**
 *
 * @author hecto
 */
public class Palindromo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        recursividad verificador = new recursividad();
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        
        System.out.print("Ingresa una palabra o frase para verificar si es palindromo: ");
        String entrada = scanner.nextLine();
        
        boolean resultado = verificador.esPalindromo(entrada);
        
        if (resultado) {
            System.out.println("Si es un palindromo.");
        } else {
            System.out.println("No es un palindromo.");
        }
        
        scanner.close();
    }
    
}
