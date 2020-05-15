/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javanpz;

/**
 *
 * @author Adasix
 */
public class Pomieszczenie extends ElementPietra
 {
    public String nazwa;
    public int szerokosc;
    public int dlugosc;
    
    @Override
    public int policzPole() 
    {
        return szerokosc * dlugosc;
    }
}

