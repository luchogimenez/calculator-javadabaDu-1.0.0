/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculator.entities;

import com.calculator.exceptions.ExceptionByZero;
import com.calculator.interfaces.Operation;
import com.calculator.util.Validation;

/**
 *
 * @author Lucho
 */
public class Power implements Operation {

    @Override
    public Double operate(Double base, Double exponent) throws Exception {
        try {
            Validation.checkByTwoZeros(base, exponent);
        } catch (ExceptionByZero e) {
            System.out.println(e.getMessage());
            throw ExceptionByZero.indeterminatedZeroToZero();
        }
        return Math.pow(base, exponent);
    }
}
