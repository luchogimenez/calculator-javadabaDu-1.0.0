/*

 */
package com.calculator.menu;

import com.calculator.entities.Add;
import com.calculator.entities.Division;
import com.calculator.entities.Multiplicate;
import com.calculator.interfaces.Operation;
import com.calculator.presentacion.Presentation;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Menu {
    
    private Scanner scan = new Scanner(System.in);

     public int optionMenu() {

        int opt = 0;
        Presentation.showMenu();
        List <Operation> operaciones = Arrays.asList(new Division(), new Add(), new Multiplicate());
        operaciones.forEach(operation -> System.out.println(operation.getOperation()));
        Operation operacion = operaciones.get(0);
                


        return opt;
    }
}
