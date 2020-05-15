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
public class Pietro implements Powierzchnia {
    
    public int numerPietra;
    public ElementPietra[] elementy;
    
    @Override
    public int policzPole() {
        int pole = 0;
        
        
        for(ElementPietra b : elementy) 
        {
            pole += b.policzPole();   
        }
        
        return pole;
    }
    
    public int podajIloscPomieszczen() {
        return elementy.length;
    }
}

