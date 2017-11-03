/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import m2i.atelierjava.entite.Serie;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class SerieTest {
    
    @Test
    public void nouvelleSerie(){
        
        Serie s1 = new Serie();
        Serie s2 = new Serie();
        
//        s1.setTitre("Dexter");
//        s1.setAnneeSortie(1995);
//        s1.setNbreSaison(8);
//        s1.setSynopsis("très gore .... lol");
        
        s1.initialise("Dexter", "blablabla", 2010, 8);
        s1.affiche();
        
        
//        s2.setTitre("Game of thrones");
//        s2.setAnneeSortie(2012);
//        s2.setNbreSaison(7);
//        s2.setSynopsis("blablabla");
        
        s2.initialise("Game of thrones", "blablabla", 2012, 7);
        s2.affiche();
    }
    
}
