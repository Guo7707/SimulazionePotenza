/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.potenze2;

/**
 *
 * @author Lombardo Guido, classe 4ID.
 */
/*
Salve a tutti, questo programma simula la funzione della potenza che
si studia in matematica e si evolve in maniera procedurale.
*/
public class _20241028_4id_Lombardo_potenzaProc {
    //instanzio le variabili, gli assegno un valore
    public int Base;
    public int Esponente;
    
     public static void main(String[] args) {
        
    int Base = (int)(Math.random() * 10);  //da 0 a 10
    System.out.println("base="+Base);
    int Esponente = (int)(Math.random() * 10);  // da 0 a 10
    System.out.println("esponente="+Esponente);
    _20241028_4id_Lombardo_potenzaProc oggetto1 = new _20241028_4id_Lombardo_potenzaProc();
    oggetto1.Pot(Base, Esponente);
     
     }
    //creo una funzione "Pot"
    void Pot(int Base, int Esponente){
        int potenza=1;
        int i;
        for (i = 0; i < Esponente; i++) {
        potenza = potenza * Base;
        }
      System.out.println("potenza="+potenza);
    }
   
     
  }

