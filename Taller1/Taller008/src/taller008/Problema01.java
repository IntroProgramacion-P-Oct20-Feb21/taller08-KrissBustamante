/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package taller008;
import java.util.Scanner;
/**
 *
 * @author USER
 */
public class Problema01 {
  public static void main(String[] args) {
     Scanner entrada = new Scanner(System.in);
     
     String palabra;
     String suma = "";
     char variable;
     
     System.out.println("Ingrese la palabra");
     palabra = entrada.nextLine();
     
     for(int i = 0; i < palabra.length(); i++){
         variable = palabra.charAt(i);
     for (int k = 0 ; k <= 1 ; k++){
         
         System.out.printf("%s", variable);
         
     }
     System.out.println("");
     }
     
      
    
} 
      
        
}
