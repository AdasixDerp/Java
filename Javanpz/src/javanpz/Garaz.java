/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanpz;

/**
 *
 * @author Krzysiek
 */
public class Garaz extends Pomieszczenie {
    public int szerokoscBramy;
    public int wysokoscBramy;
    
    @Override
    public int policzPole() 
    {
        return szerokosc * dlugosc;
    }
}