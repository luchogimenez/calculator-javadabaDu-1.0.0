/*

 */
package com.calculator.menu;

import com.calculator.entities.Add;
import com.calculator.entities.Division;
import com.calculator.entities.Logarithm;
import com.calculator.entities.Multiplicate;
import com.calculator.entities.Power;
import com.calculator.entities.Root;
import com.calculator.entities.Sub;
import com.calculator.interfaces.Operation;
import com.calculator.presentacion.Presentation;
import com.calculator.util.Validation;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {

    private Scanner scan = new Scanner(System.in).useDelimiter("\n");
   List<Operation> operations = Arrays.asList(new Division(), new Add(),
                new Multiplicate(), new Logarithm(), new Power(), new Root(), new Sub());

    public void optionMenu() throws Exception {

        String opt;
       
        do {
            Presentation.showMenu(operations);
            opt = scan.next();

        } while (!Validation.checkIntNumber(opt) || !Validation.checkIsOption(operations.size() + 1, Integer.parseInt(opt)));

        if (Integer.parseInt(opt) != (operations.size() + 1)) {
            Double num1= getNumber();
            Double num2= getNumber();
            Operation operation = operations.get(Integer.parseInt(opt)-1);
        try{
             Presentation.result(operation.operate(num1, num2));
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
       
        
             
         
        } else {
            Presentation.byeBye();
        }

    }

    private double getNumber() {
        String num;
        do {
            Presentation.showNumber();
            num = scan.next();

        } while (!Validation.checkDoubleNumber(num));
        return Double.parseDouble(num);
    }

}
