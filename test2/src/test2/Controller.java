/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.util.Observer;
import java.util.Observable;

/**
 *
 * @author Janghun
 */
public class Controller extends Observable implements Observer{
    View view;
    Model model;

    public static void main(String[] args){
        Controller c=new Controller();
    }
    
    public Controller(){
        model=new Model();
        view = new View(this);
        model.addObserver(this);
        addObserver(view);
        
        view.setVisible(true);
    } 
    
    public String getString(){
        return model.getString();
    }
    
    public void setString(String s){
        model.setString(s);
    }
    
    @Override
    public void update(Observable o, Object arg){
        setChanged();
        notifyObservers(arg);
    }
}