/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculator.exceptions;

/**
 *
 * @author Yo
 */
public class ExceptionByNegative extends Exception {

    /**
     * Creates a new instance of <code>ExceptionByNegative</code> without detail
     * message.
     */
    public ExceptionByNegative() {
    }

    /**
     * Constructs an instance of <code>ExceptionByNegative</code> with the
     * specified detail message.
     *
     * @param msg the detail message.
     */
    public ExceptionByNegative(String msg) {
        super(msg);
    }
    
    public static ExceptionByNegative numbersNegative(){
       
     return  new ExceptionByNegative("Ningún número puede ser negativo.");  
   }
}
