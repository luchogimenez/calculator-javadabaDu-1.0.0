
package com.calculator.entities;

import com.calculator.interfaces.Operation;


public class Logarithm implements Operation{
    
    @Override
    public Double operate(Double num_1, Double num_2) {
        return Math.log(num_1) / Math.log(num_2);
    }
    
}
