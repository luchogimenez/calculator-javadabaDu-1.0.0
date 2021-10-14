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
public class ExceptionByZero extends Exception {

    
    public ExceptionByZero() {
    }

    
    public ExceptionByZero(String msg) {
        super(msg);
    }
   public static ExceptionByZero divisionByZero(){

     return  new ExceptionByZero("El denominador no puede ser 0");  
    }

    public static ExceptionByZero indeterminatedZeroToZero() {

        return new ExceptionByZero("Indeterminado, no se puede elevar 0 a la 0");
    }
    
    public static ExceptionByZero notRealRoot() {

        return new ExceptionByZero("La raíz de radical par de un número negativo no tiene solución real");
    }
}
