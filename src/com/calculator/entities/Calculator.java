package com.calculator.entities;

import com.calculator.entities.Add;
import com.calculator.menu.Menu;

public class Calculator {

    private static Calculator gestor;
    private Add operationAdd;
    private Division operationDivision;
    private Multiplicate operationMultiplicate;
    private Sub operationSub;
    private Logarithm operationLog;
    private Menu menu;
    private Calculator() {
        this.operationAdd = new Add();
        this.operationSub = new Sub();
        this.operationDivision = new Division();
        this.operationMultiplicate = new Multiplicate();
        this.operationLog = new Logarithm();
        this.menu= new Menu();

    }

    public static Calculator getCalculator() {
        if (gestor == null) {
            gestor = new Calculator();
        }
        return gestor;
    }
    public void showCalculatorMenu() throws Exception{
        this.menu.optionMenu();
    }
    public Add getOperationAdd() {
        return operationAdd;
    }

    public Sub getSub() {
        return operationSub;
    }

    public Division getOperationDivision() {
        return operationDivision;
    }

    public Multiplicate getOperationMultiplicate() {
        return operationMultiplicate;
    }

    public Logarithm getOperationLog() {
        return operationLog;
    }
}
