package com.calculator.entities;

import com.calculator.exceptions.ExceptionByZero;
import com.calculator.interfaces.Operation;
import com.calculator.util.Validation;

public class Division implements Operation {

    @Override
    public Double operate(Double num_1, Double num_2) throws ExceptionByZero {
        try {
            Validation.checkByZero(num_2);

        } catch (ExceptionByZero e) {
            throw ExceptionByZero.divisionByZero();
        }
        return num_1 / num_2;
    }

    @Override
    public String getOperation() {
        return "Realizar Division";
    }

}
