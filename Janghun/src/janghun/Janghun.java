/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package janghun;

/**
 *
 * @author Janghun
 */
public class Janghun {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Runnable run1 = new ThreadTest(1);    
    Thread t1 = new Thread(run1);
    t1.start();
    
    Runnable run2 = new ThreadTest(2);    
    Thread t2 = new Thread(run2);
    t2.start();
    
    Runnable run3 = new ThreadTest(3);    
    Thread t3 = new Thread(run3);
    t3.start();
    
    Runnable run4 = new ThreadTest(4);    
    Thread t4 = new Thread(run4);
    t4.start();
    
    Runnable run5 = new ThreadTest(5);    
    Thread t5 = new Thread(run5);
    t5.start();
   
     Runnable run6 = new ThreadTest(6);    
    Thread t6 = new Thread(run6);
    t6.start();
    }
}
    

