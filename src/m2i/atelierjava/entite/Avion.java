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
public class Avion extends Vehicule{


    public Avion(String marque, boolean utilitaire, String modele, String couleur, int nbrePlace, int x, int y, int z, int pas) {
        super(marque, utilitaire, modele, couleur, nbrePlace, x, y, z, pas);
    }

    @Override
    public void reculer() {
        super.reculer(); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public void avancer() {
        super.avancer(); //To change body of generated methods, choose Tools | Templates.
        this.y = this.y + this.pas/ 2;
    }
    
    
    
}
