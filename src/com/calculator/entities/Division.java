/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculator.entities;
import com.calculator.exceptions.ExceptionDivision;
import com.calculator.interfaces.Operation;
/**
 *
 * @author dylan losada
 */
public class Division implements Operation{

    @Override
    public Double operate(Double num_1, Double num_2) throws ExceptionDivision {
      try{
          return (num_1/num_2);
      }catch(ArithmeticException  e ){
          System.out.println(e.getMessage());
          throw ExceptionDivision.divisionByZero();
      }
    
      
    }
    
}
