
package com.calculator.entities;


import com.calculator.entities.Add;

public class Calculator {
    private static Calculator gestor;
    private Add operationAdd;
<<<<<<< HEAD
    private Logarithm operationLog;

   private Calculator() {
    this.operationLog = new Logarithm();
=======
    private Sub operationSub;
    private Calculator() {
        this.operationAdd=new Add();
        this.operationSub= new Sub();
>>>>>>> 43659f220b62df73e93aab20d86b845aa7e5a885
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

<<<<<<< HEAD
    public Logarithm getOperationLog() {
        return operationLog;
=======
    public Sub getSub() {
        return operationSub;
>>>>>>> 43659f220b62df73e93aab20d86b845aa7e5a885
    }
}