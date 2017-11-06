/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import java.util.ArrayList;
import java.util.List;
import org.junit.Assert;
import org.junit.Test;

/**
 *
 * @author Formation
 */
public class CollectionTest {
    
    //@Test
    public void testList(){
        
        List<String> listeFilms = new ArrayList<>();
        
        listeFilms.add("Dracula");
        listeFilms.add("Matrix");
        listeFilms.add("Winnie l'ourson");
        
        for (String listeFilm : listeFilms) {
            
            System.out.println(listeFilm);
        }

        listeFilms.remove("Matrix");
        
        for (String listeFilm : listeFilms) {
            
            System.out.println(listeFilm);
        }
        
        listeFilms.add(1, "Razmoquette");
        
        System.out.println(listeFilms);
        
        
    }
    
    @Test
    public void testSommeListPays(){
        
        List<String> listeBelFra = new ArrayList<>();
        List<String> listeEspIta = new ArrayList<>();
        List<String> listeSommePays = new ArrayList<>();
        
        listeBelFra.add("Belgique");
        listeBelFra.add("France");
        
        listeEspIta.add("Espagne");
        listeEspIta.add("Italie");
        
        listeSommePays.addAll(listeEspIta);
        listeSommePays.addAll(listeBelFra);
        
        int nbreElem = listeSommePays.size();
        
        Assert.assertEquals(4, nbreElem);
        
        //System.out.println(listeSommePays);
        //System.out.println(listeSommePays.size());
        
    }
    
}
