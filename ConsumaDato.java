/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package semaforo;

/**
 *
 * @author arlin
 */
public class ConsumaDato extends Thread{
    
    Semaforo pieno;
    Semaforo vuoto;
    int dato;

    public ConsumaDato(Semaforo s1, Semaforo s2) {
        this.pieno = s1;
        this.vuoto = s2;
    }
    
    public void run(){
    
        while(true){
        
            this.pieno.P();
            dato = ProdConsSem.buffer;
            System.out.println("Lettore: dato letto " +this.dato);
            this.vuoto.V();
        }
    }
    
}
