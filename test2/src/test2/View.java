/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test2;



import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.BorderLayout;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import java.util.Observer;
import java.util.Observable;
/**
 *
 * @author Janghun
 */
public class View extends JFrame implements Observer{
    JPanel ContentPane;
    JPanel inputPane;
    JLabel stringLabel;
    JTextField inputField;
    JButton setButton;
    ActionListener setAction;
    Controller controller;
    
    public View(Controller cont){
        setTitle("Janghun's Test");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(500,450);
        
        controller = cont;
        
        ContentPane=new JPanel(new BorderLayout());
        setContentPane(ContentPane);
        
        stringLabel = new JLabel(controller.getString(), SwingConstants.CENTER);
        stringLabel.setFont(new Font("Conslas", Font.BOLD, 36));
        
        ContentPane.add(stringLabel, BorderLayout.CENTER);
        
        inputPane=new JPanel(new BorderLayout());
        ContentPane.add(inputPane, BorderLayout.SOUTH);
        
        inputField=new JTextField();
        setButton=new JButton("Set");
        
        inputPane.add(inputField, BorderLayout.CENTER);
        inputPane.add(setButton, BorderLayout.EAST);
        
       setAction=new ActionListener(){
            
           @Override
            public void actionPerformed(ActionEvent event) {
                    try{
                controller.setString(inputField.getText());
            }catch(Exception e){
                e.printStackTrace();
            }
            }
        };
                
        
        inputField.addActionListener(setAction);
        setButton.addActionListener(setAction);
    }
    @Override
    public void update(Observable o, Object arg){
        try{
            String s =(String)arg;
            stringLabel.setText(s);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}
