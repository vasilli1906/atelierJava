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
public class TableauTest {
    
   // @Test
    public void test(){
        
        String[] tab = new String[] {"Paris", "Tokyo", "Alger"};
        int i ;
        
        for (String s : tab) {
        
            System.out.println(s);
        }
    }
           
   // @Test
    public void test2(){
        
        String[] tab = new String[] {"Paris", "Tokyo", "Alger"};
        
        for (int i = 0; i < tab.length; i++) {
            
            System.out.println(tab[i]);
            
        }
        
        
    }
    
    @Test
    public void testTableau(){
        
        int[] tab1=new int[10];
        
        for (int i = 0; i < 10; i++) {
            
            tab1[i] = i+1;
        }
        
        for (int j : tab1) {
            
            VariablesTest v1 = new VariablesTest();
            
            System.out.println(v1.carre(j));
        }
    }
    
    
        
}
    

