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
public class Javanpz {

    /**
     * @param args the command line arguments
     */
public static void main(String[] args) {
        // TODO code application logic here
   Pomieszczenie[] mojePomieszczenia = {
                new Pomieszczenie() {
                    {
                        this.szerokosc = 3;
                        this.dlugosc = 2;
                        this.nazwa = "pokoj";
                    }
                },
                new Pomieszczenie() {
                    {
                        szerokosc = 2;
                        dlugosc = 2;
                        nazwa = "lazienka";
                    }
                }
        };

        Mieszkanie mojeMieszkanie = new Mieszkanie(){
            {
                pomieszczenia = mojePomieszczenia;
                wizytowka = "Kowalscy";
            }
        };

        ElementPietra[] mojeElementyParteru = {
                mojeMieszkanie,
                new Pomieszczenie(){
                    {
                        szerokosc = 2;
                        dlugosc = 2;
                        nazwa = "suszarnia";
                    }
                }
        };

        Pietro[] mojePietra = {
                new Pietro(){
                    {
                        numerPietra = 0;
                        elementy = mojeElementyParteru;
                    }
                }
        };

        Garaz[] mojeGaraze = {
                new Garaz() {
                    {
                        szerokoscBramy = 3;
                        wysokoscBramy = 2;
                        szerokosc = 5;
                        dlugosc = 5;
                    }
                }
        };

        Budynek mojBudynek = new Budynek(){
            {
                powierzchniaDzialki = 20;
                pietra = mojePietra;
                garaze = mojeGaraze;
            }
        };

        System.out.println(mojBudynek.policzPole());

    }
}


