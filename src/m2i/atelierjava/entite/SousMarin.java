/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.entite;

/**
 *
 * @author Formation
 */
public class SousMarin extends Vehicule{
    
    private boolean monte;

    public boolean isMonte() {
        return monte;
    }

    public void setMonte(boolean monte) {
        this.monte = monte;
    }

    public SousMarin(boolean monte, String marque, boolean utilitaire, String modele, String couleur, int nbrePlace, int x, int y, int z, int pas) {
        super(marque, utilitaire, modele, couleur, nbrePlace, x, y, z, pas);
        this.monte = monte;
    }


    @Override
    public void reculer() {
        super.reculer(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void avancer() {
        super.avancer(); //To change body of generated methods, choose Tools | Templates.
        
        if(this.monte == true){
            
            this.y = this.y += pas;
        } else { 
            
            this.y = this.y -= pas;
        }
    }
    
    
    
    
}
