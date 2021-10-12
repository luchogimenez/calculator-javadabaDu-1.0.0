/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculator.exceptions;

/**
 *
 * @author Admin
 */
public class ExceptionDivision extends Exception {

    
    public ExceptionDivision() {
    }

    
    public ExceptionDivision(String msg) {
        super(msg);
    }
   public static ExceptionDivision divisionByZero(){
     return  new ExceptionDivision("No se puede dividir por 0");  
   }
}
