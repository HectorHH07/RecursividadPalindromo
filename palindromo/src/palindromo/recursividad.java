/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package palindromo;

/**
 *
 * @author hecto
 */
public class recursividad {
    
    
    private boolean esPalindromoHelper(String palabra, int inicio, int fin) {
    // 1. Caso base
    if (inicio >= fin) {
        return true;
    }
    // 2. Paso recursivo: comparar extremos y avanzar
    if (palabra.charAt(inicio) != palabra.charAt(fin)) {
        return false;
    }
    return esPalindromoHelper(palabra, inicio + 1, fin - 1);
}
    
    public boolean esPalindromo(String palabra) {
    if (palabra == null) {
        return false;
    }
    // 1. Limpiamos la cadena antes de evaluar
    String limpia = palabra.toLowerCase().replaceAll("[^a-zA-Z]", "");
    // 2. Llamamos al método auxiliar con la palabra limpia
    return esPalindromoHelper(limpia, 0, limpia.length() - 1);
}
    
}
