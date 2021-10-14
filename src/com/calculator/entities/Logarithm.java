
package com.calculator.entities;

import com.calculator.exceptions.ExceptionByNegative;
import com.calculator.exceptions.ExceptionByZero;
import com.calculator.interfaces.Operation;
import com.calculator.util.Validation;


public class Logarithm implements Operation{
    
    @Override
    public Double operate(Double num_1, Double num_2) throws ExceptionByNegative, ExceptionByZero {
        try{
            Validation.checkByZero(num_1);
            Validation.checkByZero(num_2);
            Validation.checkByNegative(num_1, num_2);
        }catch(ExceptionByNegative e){
            
            throw ExceptionByNegative.numbersNegative();
            
        }catch(ExceptionByZero e){
            
            throw new ExceptionByZero("No se admiten ceros en la base ni en el argumento");
            
        }
        
       
        return Math.log(num_1) / Math.log(num_2);
    }

    @Override
    public String getOperation() {
    return "Realizar Logaritmo";
    }
    
}
