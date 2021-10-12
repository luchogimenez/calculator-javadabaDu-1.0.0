/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculator.entities;

/**
 *
 * @author dylan losada
 */
public class Calculator {
    private static Calculator calculator;

    private Calculator() {
    }
    
    public static Calculator getCalculator(){
        if(calculator == null){
            calculator = new Calculator();
        }
        return calculator;
    }
}
