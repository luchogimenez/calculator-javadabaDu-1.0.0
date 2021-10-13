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
public class Root implements Operation{

    @Override
    public Double operate(Double radicand, Double index) throws ExceptionByZero{
        try{
            Validation.checkByZero(index);
            Validation.checkByEvenIndexAndNegativeRadicand(radicand, index);
        }catch(ExceptionByZero e){
            System.out.println(e.getMessage());
            throw ExceptionByZero.notRealRoot();
        }
        if(radicand<0){
            return -Math.pow(Math.abs(radicand),(double)(1/index));
        }else{
            return Math.pow(radicand,(double)(1/index));
        }
        
    }
    
}
