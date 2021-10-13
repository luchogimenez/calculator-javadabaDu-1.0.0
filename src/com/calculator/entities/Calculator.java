
package com.calculator.entities;


import com.calculator.entities.Add;

public class Calculator {
    private static Calculator gestor;
    private Add operationAdd;
    private Logarithm operationLog;

   private Calculator() {
    this.operationLog = new Logarithm();
    }
    
    public static Calculator getCalculator(){
        if(gestor == null){
            gestor = new Calculator();
        }
        return gestor;
    }

    public Add getOperationAdd() {
        return operationAdd;
    }

    public Logarithm getOperationLog() {
        return operationLog;
    }
}