
package com.calculator.util;

import com.calculator.exceptions.ExceptionByZero;


public class Validation {
    
    
    
     public static void checkByZero(Double num_2) throws ExceptionByZero {
        if (num_2 == 0d) {
            throw new ExceptionByZero();
        }
    }
     
    public static void checkByTwoZeros(Double num_1,Double num_2) throws ExceptionByZero{
        if (num_1 == 0d && num_2==0d) {
            throw new ExceptionByZero();
        }
    }
    
    public static void checkByEvenIndexAndNegativeRadicand(Double radicand,Double index) throws ExceptionByZero{
        if (radicand < 0 && index%2==0) {
            throw new ExceptionByZero();
        } 
    }
}
