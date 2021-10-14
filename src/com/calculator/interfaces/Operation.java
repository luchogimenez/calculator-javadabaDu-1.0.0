/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.calculator.interfaces;
public interface Operation {
    Double operate(Double num_1, Double num_2)throws Exception;
    String getOperation();
}