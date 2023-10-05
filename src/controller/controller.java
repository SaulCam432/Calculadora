/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controller;

import java.awt.Button;
import java.awt.Color;
import static java.awt.Frame.ICONIFIED;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.event.AncestorListener;
import model.model;
import view.view;

/**
 *
 * @author Saúl
 */
public class controller implements ActionListener, MouseListener{
    private view view;
    private model model;
    boolean darkMode = false;
    
    
    public controller(view v, model model) {
        this.view = v;
        this.model = model;
        
        this.view.btn1.addActionListener(this);
        this.view.btn2.addActionListener(this);
        this.view.btn3.addActionListener(this);
        this.view.btn4.addActionListener(this);
        this.view.btn5.addActionListener(this);
        this.view.btn6.addActionListener(this);
        this.view.btn7.addActionListener(this);
        this.view.btn8.addActionListener(this);
        this.view.btn9.addActionListener(this);
        this.view.btn0.addActionListener(this);
        this.view.btnDelete.addActionListener(this);
        this.view.btnExp.addActionListener(this);
        this.view.btnPorc.addActionListener(this);
        this.view.btnDiv.addActionListener(this);
        this.view.btnMulti.addActionListener(this);
        this.view.btnMinus.addActionListener(this);
        this.view.btnPlus.addActionListener(this);
        this.view.btnResult.addActionListener(this);
        this.view.btnPount.addActionListener(this);
        this.view.btnViewMode.addActionListener(this);
        this.view.btnClose.addMouseListener(this);
        this.view.btnMin.addMouseListener(this);
    }
    
    public void iniciar(){
        view.setLocationRelativeTo(null);
    }
    
    public void changeColorDark(JButton button){
        button.setIcon(new ImageIcon(getClass().getResource("/Images/btn4_dark.png")));
        button.setPressedIcon(new ImageIcon(getClass().getResource("/Images/btn4_dark.png")));
        button.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/btn3_dark.png")));
        button.setForeground(Color.decode("#adbfc3"));
    }
    
    public void changeColorOperatorDark(JButton bu){
        bu.setIcon(new ImageIcon(getClass().getResource("/Images/btn2_pressed_dark.png")));
        bu.setForeground(Color.decode("#ffffff"));
        bu.setPressedIcon(new ImageIcon(getClass().getResource("/Images/btn2_pressed_dark.png")));
        bu.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/btn2_dark.png")));
        
    }
    
    
    public void darkModeView(){
        this.view.btnViewMode.setIcon(new ImageIcon(getClass().getResource("/Images/btnLightMode.png")));
        this.view.jpDesk.setBackground(Color.decode("#464a4b"));
        this.view.jpResult.setBackground(Color.decode("#464a4b"));
        this.view.lblResult.setForeground(Color.decode("#adbfc3"));
        
        
        changeColorDark(this.view.btn1);
        changeColorDark(this.view.btn2);
        changeColorDark(this.view.btn3);
        changeColorDark(this.view.btn4);
        changeColorDark(this.view.btn5);
        changeColorDark(this.view.btn6);
        changeColorDark(this.view.btn7);
        changeColorDark(this.view.btn8);
        changeColorDark(this.view.btn9);
        changeColorDark(this.view.btn0);
        changeColorDark(this.view.btnPount);
        
        this.view.btnDelete.setIcon(new ImageIcon(getClass().getResource("/Images/btn1_dark.png")));
        this.view.btnDelete.setPressedIcon(new ImageIcon(getClass().getResource("/Images/btn1_dark.png")));
        this.view.btnDelete.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/btn1_pressed_dark.png")));
        this.view.btnDelete.setForeground(Color.decode("#ffffff"));
        
        
        changeColorOperatorDark(this.view.btnExp);
        changeColorOperatorDark(this.view.btnDiv);
        changeColorOperatorDark(this.view.btnPorc);
        changeColorOperatorDark(this.view.btnDiv);
        changeColorOperatorDark(this.view.btnMulti);
        changeColorOperatorDark(this.view.btnMinus);
        changeColorOperatorDark(this.view.btnPlus);
        
        this.view.btnResult.setIcon(new ImageIcon(getClass().getResource("/Images/btn3_dark.png")));
        this.view.btnResult.setPressedIcon(new ImageIcon(getClass().getResource("/Images/btn3_dark.png")));
        this.view.btnResult.setRolloverIcon(new ImageIcon(getClass().getResource("/Images/btn3_pressed_dark.png")));
        this.view.btnResult.setForeground(Color.decode("#ffffff"));
        
        
    }
    
    public void lightModeView(){
        model m=new model();
        view c=new view();
        controller con=new controller(c,m);
        con.iniciar();
        
        c.setVisible(true);
        c.setResizable(false);
        this.view.dispose();
       
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try{
            
            String opc;
            opc=e.getActionCommand();
            
            switch(opc){
                case "1":
                    this.view.lblResult.setText(this.view.lblResult.getText()+"1");
                    break;
                    
                case "2":
                    this.view.lblResult.setText(this.view.lblResult.getText()+"2");
                    break;
                    
                case "3":
                    this.view.lblResult.setText(this.view.lblResult.getText()+"3");
                    break;
                
                case "4":
                    this.view.lblResult.setText(this.view.lblResult.getText()+"4");
                    break;
                
                case "5":
                    this.view.lblResult.setText(this.view.lblResult.getText()+"5");
                    break;
                
                case "6":
                    this.view.lblResult.setText(this.view.lblResult.getText()+"6");
                    break;
                
                case "7":
                    this.view.lblResult.setText(this.view.lblResult.getText()+"7");
                    break;
                
                case "8":
                    this.view.lblResult.setText(this.view.lblResult.getText()+"8");
                    break;
                
                case "9":
                    this.view.lblResult.setText(this.view.lblResult.getText()+"9");
                    break;
                
                case "0":
                    this.view.lblResult.setText(this.view.lblResult.getText()+"0");
                    break;
                
                case "+":
                    this.model.num1=Float.parseFloat(this.view.lblResult.getText());
                    this.model.operator="+";
                    this.view.lblResult.setText(""); 
                    break;
                    
                case "-":
                    this.model.num1=Float.parseFloat(this.view.lblResult.getText());
                    this.model.operator="-";
                    this.view.lblResult.setText(""); 
                    break;
                    
                case "X":
                    this.model.num1=Float.parseFloat(this.view.lblResult.getText());
                    this.model.operator="x";
                    this.view.lblResult.setText(""); 
                    break;
                    
                case "/":
                    this.model.num1=Float.parseFloat(this.view.lblResult.getText());
                    this.model.operator="/";
                    this.view.lblResult.setText(""); 
                    break;
                    
                case "%":
                    this.model.num1=Float.parseFloat(this.view.lblResult.getText());
                    this.model.operator="%";
                    this.view.lblResult.setText(""); 
                    break;
                    
                case "^":
                    this.model.num1=Float.parseFloat(this.view.lblResult.getText());
                    this.model.operator="^";
                    this.view.lblResult.setText(""); 
                    break;
                    
                case "C":                 
                    this.view.lblResult.setText(""); 
                    break;
                    
                case "btnClose":                 
                    this.view.lblResult.setText(""); 
                    break;
                    
                case "btnMin":                 
                    this.view.lblResult.setText(""); 
                    break;    
                
                case "mode":                    
                    if(!darkMode){
                        darkModeView();
                        darkMode = true;
                    }else{
                        lightModeView();
                        darkMode = false;
                    }                                    
                    break;
                    
                case "close":                 
                this.view.lblResult.setText(String.valueOf("El boton funciona")); 
                break;

                case "minim":                 
                this.view.lblResult.setText(String.valueOf("El boton funciona")); 
                break;
                
                case "=":    
                    this.model.num2=Float.parseFloat(this.view.lblResult.getText());
                    switch(this.model.operator){
                        case "+":
                            model.suma();
                            this.view.lblResult.setText(String.valueOf(this.model.getResult()));
                            break; 
                        case "-":
                            model.resta();
                            this.view.lblResult.setText(String.valueOf(this.model.getResult()));
                            break; 
                        case "x":
                            model.multiplicacion();
                            this.view.lblResult.setText(String.valueOf(this.model.getResult()));
                            break; 
                        case "%":
                            model.porcentaje();
                            this.view.lblResult.setText(String.valueOf(this.model.getResult()));
                            break; 
                        case "^":
                            model.exponente();
                            this.view.lblResult.setText(String.valueOf(this.model.getResult()));
                            break;                            
                        case "/":
                            if(model.num2!=0){
                            model.division();
                            this.view.lblResult.setText(String.valueOf(this.model.getResult()));
                            }
                            else{
                                JOptionPane.showMessageDialog(null, "el numerador no puede ser cero");
                                this.view.lblResult.setText("");
                            }
                            break;           
                        }
                    break;
            }
        }catch(Exception x){
            
        }
        
       
    }

    @Override
    public void mouseClicked(MouseEvent em) {
        String opcM;
        if(em.getSource() == this.view.btnClose){
            this.view.dispose();
        }
        
        if(em.getSource() == this.view.btnMin){
                this.view.setExtendedState(ICONIFIED);
        }
            
    }

    @Override
    public void mousePressed(MouseEvent em) {
    }

    @Override
    public void mouseReleased(MouseEvent em) {
    }

    @Override
    public void mouseEntered(MouseEvent em) {
    }

    @Override
    public void mouseExited(MouseEvent em) {
    }
    
 
}
