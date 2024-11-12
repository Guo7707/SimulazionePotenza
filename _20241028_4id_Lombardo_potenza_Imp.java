/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.potenze1;

/**
 *
 * @author Lombardo Guido, classe 4ID.
 */

/*
Salve a tutti, questo programma simula la funzione della potenza che
si studia in matematica e si evolve in maniera sequenziale.
*/
public class _20241028_4id_Lombardo_potenza_Imp {
   //instanzio le variabili
    public int Base;
    public int Esponente;
    
    
    
    
    
    //assegno un valore casuale alle varabili e le stampo
     public static void main(String[] args) {
    
    
    int Base = (int)(Math.random() * 10);  //da 0 a 10
    System.out.println("base="+Base);
  
     
    int Esponente = (int)(Math.random() * 10);  // da 0 a 10
    System.out.println("esponente="+Esponente);
    
    //instanzio le variabili del main
   int potenza=1;
   int i;
  
    
   /*Moltiplico la variabile base per sé stessa il numero di volte 
   corrispondente al valore della variabile esponente.*/
    for (i = 0; i < Esponente; i++) {
  potenza = potenza * Base;
 }
    //stampo la variabile "potenza"
    System.out.println("potenza="+potenza);
 }   
}
