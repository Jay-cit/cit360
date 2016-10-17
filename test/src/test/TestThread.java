/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

/**
 *
 * @author Janghun
 */
public class TestThread extends Thread {

    public TestThread(Runnable runnable){
            super(runnable);
    }
   
    @Override
    public void run(){
        System.out.println("Start Thread");
        super.run();
        System.out.println("End Thread");
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args){
     
        TestRunnable runnable = new TestRunnable();
        
        TestThread thread = new TestThread(runnable);
       
        thread.start();
        }
}
class TestRunnable implements Runnable{
    @Override
    public void run(){
        System.out.println("This is Runnable");
    }
}