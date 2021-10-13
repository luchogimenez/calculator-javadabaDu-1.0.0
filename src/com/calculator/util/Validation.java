
package com.calculator.util;

import com.calculator.exceptions.ExceptionByZero;


public class Validation {
    
    
    
     public static void checkByZero(Double num_2) throws ExceptionByZero {
        if (num_2 == 0d) {
            throw new ExceptionByZero();
        }
    }
}
