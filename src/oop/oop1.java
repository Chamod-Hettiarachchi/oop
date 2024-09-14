/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

import java.util.jar.Attributes;

/**
 *
 * @author Chamod
 */
public class oop1 {
    
    
    private int Number1;
    private int Number2;

    /**
     * @return the Number1
     */
    public int getNumber1() {
        return Number1;
    }

    /**
     * @param Number1 the Number1 to set
     */
    public void setNumber1(int Number1) {
        this.Number1 = Number1;
    }

    /**
     * @return the Number2
     */
    public int getNumber2() {
        return Number2;
    }

    /**
     * @param Number2 the Number2 to set
     */
    public void setNumber2(int Number2) {
        this.Number2 = Number2;
    }
    public void send() {
        Oop oop=new Oop();
        this.Number1 = 10;
        oop.setB(this.Number1);
    }
    public static void main(String[] args) {
        
        
        
    
    }
    
}
