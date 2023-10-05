/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculadora;

import controller.controller;
import java.awt.Dimension;
import model.model;
import view.view;

/**
 *
 * @author Saúl
 */
public class Calculadora {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        model m=new model();
        view c=new view();
        controller con=new controller(c,m);
        con.iniciar();
        c.setVisible(true);
        c.setResizable(false);
    }
    
}
