package com.calculator.entities;

import com.calculator.interfaces.Operation;

public class Multiplicate implements Operation {

    @Override
    public Double operate(Double num_1, Double num_2) {
        return (num_1 * num_2);
    }

    @Override
    public String getOperation() {

        return "Realizar Multiplicacion";
    }

}
