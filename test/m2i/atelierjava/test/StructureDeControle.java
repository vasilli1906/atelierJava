/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.test;

import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Formation
 */
public class StructureDeControle {
    
//    @Test
    public void testWhile(){
        
        boolean termine = false;
        int i = 0;
        
        while (i <= 10) {

            System.out.println(i);
            i++;
            
        }
    }
    
    public void lancerSort(String ingredient){
        
        switch(ingredient){
            case "Bave de crapaud":
                //action
                break;
            case "Aile de chauve-souris":
                //action
                break;
            case "Pustule de sorcière":
                //action
                break;
            default:
                System.out.println("Ca n'existe pas !");
        }
        
    }
    
    @Test
    public void testSwitch(){
        
        String carte = "Bave de crapaud";
        
        
    }
    
}
