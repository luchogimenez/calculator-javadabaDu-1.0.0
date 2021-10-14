package com.calculator.entities;

import com.calculator.entities.Add;

public class Calculator {

    private static Calculator gestor;
    private Add operationAdd;
    private Division operationDivision;
    private Multiplicate operationMultiplicate;
    private Sub operationSub;
    private Logarithm operationLog;

    private Calculator() {
        this.operationAdd = new Add();
        this.operationSub = new Sub();
        this.operationDivision = new Division();
        this.operationMultiplicate = new Multiplicate();
        this.operationLog = new Logarithm();

    }

    public static Calculator getCalculator() {
        if (gestor == null) {
            gestor = new Calculator();
        }
        return gestor;
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
