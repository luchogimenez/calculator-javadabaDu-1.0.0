package com.calculator.entities;

import com.calculator.menu.Menu;

public class Calculator {

    private static Calculator gestor;
    private Menu menu;
    
    private Calculator() {

        this.menu= new Menu();
    }

    public static Calculator getCalculator() {
        if (gestor == null) {
            gestor = new Calculator();
        }
        return gestor;
    }
    public void showCalculatorMenu(){
        this.menu.optionMenu();
    }
}
