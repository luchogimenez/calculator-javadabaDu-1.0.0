/*

 */
package com.calculator.presentacion;

import com.calculator.interfaces.Operation;
import java.util.List;


public class Presentation {


    public static void showMenu(List <Operation> operaciones) {
        System.out.println("Calculadora Javadabadu1.0.0");
      
        int i =1;
         for (Operation operacione : operaciones) {
             System.out.println((i++) +")"+ operacione.getOperation());
         }
         System.out.println((i++) +")Salir");
        System.out.println("Seleccione una operación :");  

    }
    public static void showNumber(){
        System.out.println("Ingrese el numero:");
    }
    public static void byeBye(){
        System.out.println("Gracias por elegirnos :D");
    }
    
     public static void result(double result){
        System.out.println("El resultado de su operacion es :"+result);
    }
}
