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
public class Mieszkanie extends ElementPietra 
{
    public Pomieszczenie[] pomieszczenia;
    public String wizytowka;
    
    @Override
    public int policzPole() 
    {
        int pole = 0;
        
        for(Pomieszczenie a : pomieszczenia) 
        {
            pole += a.policzPole();
        }
        
        return pole;
    }
}

