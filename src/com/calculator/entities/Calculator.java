
package com.calculator.entities;

<<<<<<< HEAD

=======
>>>>>>> 181978b18df03d0b9190c7d6b4624611024fabc3
import com.calculator.entities.Add;

public class Calculator {

    private static Calculator gestor;
    private Add operationAdd;
<<<<<<< HEAD
<<<<<<< HEAD
    private Logarithm operationLog;

   private Calculator() {
    this.operationLog = new Logarithm();
=======
=======

    private Division operationDivision;
    private Multiplicate operationMultiplicate;
>>>>>>> 181978b18df03d0b9190c7d6b4624611024fabc3
    private Sub operationSub;

    private Calculator() {
<<<<<<< HEAD
        this.operationAdd=new Add();
        this.operationSub= new Sub();
>>>>>>> 43659f220b62df73e93aab20d86b845aa7e5a885
    }
=======
        this.operationAdd = new Add();
        this.operationSub = new Sub();
        this.operationDivision = new Division();
        this.operationMultiplicate = new Multiplicate();
>>>>>>> 181978b18df03d0b9190c7d6b4624611024fabc3
    
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

<<<<<<< HEAD
<<<<<<< HEAD
    public Logarithm getOperationLog() {
        return operationLog;
=======
=======

    public Division getOperationDivision() {
        return operationDivision;
    }

    public Multiplicate getOperationMultiplicate() {
        return operationMultiplicate;
    }

>>>>>>> 181978b18df03d0b9190c7d6b4624611024fabc3
    public Sub getSub() {
        return operationSub;
>>>>>>> 43659f220b62df73e93aab20d86b845aa7e5a885
    }
}


