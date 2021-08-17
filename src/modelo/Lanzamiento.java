/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import modelo.Base;

/**
 *
 * @author nicolas_san.diaz
 */
public class Lanzamiento extends Base{
    
        private int dado1;
        private int dado2;

    public Lanzamiento() {
    }

    public Lanzamiento(int dado1, int dado2) {
        this.dado1 = dado1;
        this.dado2 = dado2;
    }

        
        
    /**
     * Get the value of dado2
     *
     * @return the value of dado2
     */
    public int getDado2() {
        return dado2;
    }

    /**
     * Set the value of dado2
     *
     * @param dado2 new value of dado2
     */
    public void setDado2(int dado2) {
        this.dado2 = dado2;
    }


    /**
     * Get the value of dado1
     *
     * @return the value of dado1
     */
    public int getDado1() {
        return dado1;
    }

    /**
     * Set the value of dado1
     *
     * @param dado1 new value of dado1
     */
    public void setDado1(int dado1) {
        this.dado1 = dado1;
    }

    @Override
    public String toString() {
        return  "Dado 1" + dado1 + ", Dado2" + dado2 + '}';
    }

    
    
    @Override
    public Base copy() {
        
        return new Lanzamiento(dado1, dado2);
        
    }
    
    
    
    
}
