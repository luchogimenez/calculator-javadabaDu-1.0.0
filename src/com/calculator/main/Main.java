/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculator.main;

import com.calculator.entities.Calculator;

public class Main {
    public static void main(String[] args) throws Exception{
        Calculator calcu = Calculator.getCalculator();
        calcu.showCalculatorMenu();
        
       // calculator.getAdd().operate(1, 2);
    }
}
