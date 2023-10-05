/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author Saúl
 */
public class model {
    public float num1;
    public float num2;
    private float result;
    public String operator;

    public float getNum1() {
        return num1;
    }

    public void setNum1(float num1) {
        this.num1 = num1;
    }

    public float getNum2() {
        return num2;
    }

    public void setNum2(float num2) {
        this.num2 = num2;
    }

    public float getResult() {
        return result;
    }

    public void setResult(float result) {
        this.result = result;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
    
    public float suma(){
        this.result = this.getNum1() + this.getNum2();
        return this.result;
    }
    
    public float resta(){
        this.result = this.getNum1() - this.getNum2();
        return this.result;
    }
    
    public float multiplicacion(){
        this.result = this.getNum1() * this.getNum2();
        return this.result;
    }
    
    public float division(){
        this.result = this.getNum1() / this.getNum2();
        return this.result;
    }
    
    public float porcentaje(){
        this.result = (this.getNum1() * this.getNum2()) / 100;
        return this.result;
    }
    
    public float exponente(){
        this.result=(float) Math.pow(this.getNum1(), this.getNum2());
        return this.result;
    }
}
