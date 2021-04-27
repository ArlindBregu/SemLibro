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
public class Semaforo {
    
    int valore;
    
    public Semaforo(int valore){
    
        this.valore = valore;
    }
    
    synchronized public void P(){
    
        while(this.valore == 0){
        
            try{
            
                wait();
                
            }catch(InterruptedException e){}
        }
        
        this.valore--;
    }
    
    synchronized public void V(){
    
        this.valore++;
        notify();
    }
    
}
