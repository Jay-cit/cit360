/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;

import java.util.Observable;
/**
 *
 * @author Janghun
 */
public class Model extends Observable{
    String data;


    public Model(){
        data="";
    }
    public void setString(String data){
        this.data = data;
        setChanged();
        notifyObservers(data);
    }
    public String getString(){
        return data;
    }
}
