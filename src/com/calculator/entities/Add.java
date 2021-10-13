/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculator.entities;

import com.calculator.interfaces.Operation;

public class Add implements Operation{

    @Override
    public Double operate(Double num_1, Double num_2) {
         
        return (num_1+num_2);
    }
    
}
