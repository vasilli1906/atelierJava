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
public class VariablesTest {
    
    @Test
    public void testVariablesObjets() {
        
        String txt1 = new String("couCOU123!");
        String txt2 = txt1.toUpperCase();
        
        System.out.println(txt2);
    }
    
    @Test
    public void testPaysCapitales(){
    
        String pays = new String("Jamaique");
        String capitale = new String("Kingston");
        String c = capitale + ", " + pays;
        
        System.out.println(c);
        
    }
    
    @Test
    public void testPermitation(){
        int a = 123;
        String b = new String("coucou");
        String c = a + " " + b;
        String d = b + " " + a;
        
        System.out.println(c);
        System.out.println(d);
        
    }
    
    @Test
    public void testConversion(){
    
        String a = new String("10");
        int b = 20;
        int c = Integer.valueOf(a) + b;
        int d = b + Integer.valueOf(a);
        
        System.out.println("a + b = " + c);
        System.out.println("b + a = " + d);
        
    }
    
    @Test
    public void testCarre(){
        
        int resultat = carre(6);
        
        System.out.println(resultat);
    }
    
    @Test
    public void testPuissance(){
       
        int resultat = puiss(3, 4);
        
        System.out.println(resultat);
    }
    
    
    public int carre( int nbre) {
        
        int resultat = nbre * nbre;
        
        return resultat;
    }
    
    public double puissance(double nbre, double exposant){
    
        double resultat = Math.pow(nbre, exposant);
        
        return resultat;
        
    }
    
    public int puiss(int nbre, int exposant){
        
        int resultat;
        
        if (exposant == 0){
            return 1;
        } else {
            return (nbre * puiss(nbre, exposant - 1));
        }
    }
    
}
