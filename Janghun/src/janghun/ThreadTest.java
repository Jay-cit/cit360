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
public class ThreadTest implements Runnable{
    private int num;
    
    public ThreadTest(int num){
        this.num = num;
    }
    
    public void run(){
        try{
            System.out.print("Thread Start : "+ this.num);
            Thread.sleep(5000);
            System.out.print("Thread End : "+ this.num);
        } catch (InterruptedException ex) {
           ex.printStackTrace();
        }
        }
    }
