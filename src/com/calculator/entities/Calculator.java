    /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculator.entities;

/**
 *
 * @author dylan losada
 */
import com.calculator.entities.Add;

public class Calculator {
    private static Calculator gestor;
    private Add operationAdd;

   private Calculator() {
    }
    
    public static Calculator getCalculator(){
        if(gestor == null){
            gestor = new Calculator();
        }
        return gestor;
    }

    public Add getAdd() {
        return operationAdd;
    }
}