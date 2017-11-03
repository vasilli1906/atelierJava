/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import m2i.atelierjava.entite.Avion;
import m2i.atelierjava.entite.SousMarin;
import m2i.atelierjava.entite.Vehicule;
import org.junit.Test;

/**
 *
 * @author Formation
 */ 
public class VehiculeTest {
    
    @Test
    public void testSousMarin(){
        SousMarin s = new SousMarin(true, "jkj", true, "modele", "couleur", 0, 0, 0, 0, 5);
        s.avancer();
        s.afficher();
    }

//@Test
    public void testAvion(){
        
        Avion a = new Avion("boeing", false, "457", "blanc", 200, 0, 0, 0, 100);
        a.afficher();
        a.avancer();
        a.afficher();
        a.avancer();
        a.afficher();
        a.avancer();
    }
    
//    @Test
    public void testVehicule(){
        
        Vehicule vehic1 = new Vehicule("Ferrari", false, "F50", "Rouge", 2, 0, 0, 0, 4);
        
        vehic1.avancer();
        vehic1.afficher();
        vehic1.avancer();
        vehic1.afficher();
        vehic1.reculer();
        vehic1.afficher();
    }
    
}
