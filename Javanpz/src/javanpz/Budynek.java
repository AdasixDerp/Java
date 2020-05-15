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
public class Budynek implements Powierzchnia{

   public int powierzchniDzialki;
   public int iloscPieter;
   public Pietro[] pietra;
   public Garaz[] garaze;
   
    @Override
    public int policzPole() {
        return powierzchniDzialki;
    }
    
}
 

