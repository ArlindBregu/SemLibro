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
public class ProduciDato extends Thread{
    
     Semaforo pieno;
    Semaforo vuoto;
    int tanti = 5;
    final int attesa = 500;

    public ProduciDato(Semaforo pieno, Semaforo vuoto) {
        this.pieno = pieno;
        this.vuoto = vuoto;
    }
    
    public void run(){
    
        for(int i=0; i<this.tanti; i++){
        
            this.vuoto.P();
            ProdConsSem.buffer = (int)(Math.random() * 101);
            System.out.println("Scrittore: dato scritto: " +ProdConsSem.buffer);
            this.pieno.V();
            
            try {
                Thread.sleep(this.attesa);
            } catch (Exception e) {
            }
        }
        
        System.out.println("Scrittore: termine scrittura dati.");
    }
    
}
