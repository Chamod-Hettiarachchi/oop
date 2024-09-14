/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oop;

/**
 *
 * @author Chamod
 */
public class Oop extends oop1{
int b;

public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
       Oop o= new Oop();
       oop1 oo=new oop1();
       oo.send();
        System.out.println(o.getB());
        
    }
    
}
