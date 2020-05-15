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
public class Budynek implements Powierzchnia {

    public int powierzchniaDzialki;
    public Pietro[] pietra;
    public Garaz[] garaze;
    
    @Override
    public int policzPole() {
       
        int pole = 0;

// korzystamy z pętli for each

        for(Pietro a : pietra) pole += a.policzPole();
        for(Garaz a : garaze) pole += a.policzPole();
        
        return pole;
    }
    
    public int podajIloscPieter() {
        return pietra.length;
    }
}
