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
public class Vehicule {
    
    protected String marque;
    protected boolean utilitaire;
    protected String modele;
    protected String couleur;
    protected int nbrePlace;
    protected int x, y, z, pas;

    
    
    public Vehicule(){
        
        
        
    }

    public Vehicule(String marque, boolean utilitaire, String modele, String couleur, int nbrePlace, int x, int y, int z, int pas) {
        this.marque = marque;
        this.utilitaire = utilitaire;
        this.modele = modele;
        this.couleur = couleur;
        this.nbrePlace = nbrePlace;
        this.x = x;
        this.y = y;
        this.z = z;
        this.pas = pas;
    }
    
    public int getPas() {
        return pas;
    }

    public void setPas(int pas) {
        this.pas = pas;
    }
    
    

    public String getMarque() {
        return marque;
    }

    public void setMarque(String marque) {
        this.marque = marque;
    }

    public boolean isUtilitaire() {
        return utilitaire;
    }

    public void setUtilitaire(boolean utilitaire) {
        this.utilitaire = utilitaire;
    }

    public String getModele() {
        return modele;
    }

    public void setModele(String modele) {
        this.modele = modele;
    }

    public String getCouleur() {
        return couleur;
    }

    public void setCouleur(String couleur) {
        this.couleur = couleur;
    }

    public int getNbrePlace() {
        return nbrePlace;
    }

    public void setNbrePlace(int nbrePlace) {
        this.nbrePlace = nbrePlace;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
    
    
    
    // fonction qui fait avancer la voiture
    public void avancer(){
        z += this.pas;
    } 
    
    public void reculer(){
        
        z -= this.pas;
    }
    
    public void afficher(){
    
        String txt = String.format("Vehicule : marque = %s utilitaire = %s modele = %s couleur = %s places = %d [%d, %d, %d], vitesse = %d",
                this.marque,
                this.utilitaire,
                this.modele,
                this.couleur,
                this.nbrePlace,
                this.x,
                this.y,
                this.z,
                this.pas);
        
        System.out.println(txt);
    }
    
    
    
}
