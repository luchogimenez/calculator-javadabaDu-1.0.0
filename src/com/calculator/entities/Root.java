/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculator.entities;

import com.calculator.interfaces.Operation;

/**
 *
 * @author Lucho
 */
public class Root implements Operation{

    @Override
    public Double operate(Double num_1, Double num_2) throws Exception{
        Double raiz = null;
        try{
            raiz = Math.pow(num_1,1/num_2);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
        
        return raiz;
    }
    
}
