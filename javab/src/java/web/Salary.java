/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package web;

/**
 *
 * @author Janghun
 */
public class Salary{
	private int month;
	
	public int getMonth(){
		return month;
	}
	public void setMonth(int month){
		this.month = month;
        }
	public int getDaily(){
		return(this.month/20);
	}
	public int getYear(){
		return(this.month*12);
	}
}