/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package m2i.atelierjava.entite;

import java.util.Date;

/**
 *
 * @author Formation
 */
public class Film {
    
    private String titre;
    private String synopsis;
    private int anneeProduction;
    private Date dateCreation;
    
    public void initialise(String titre, String synopsis, int anneeProduction, Date dateCreation){
        
        this.titre = titre;
        this.synopsis = synopsis;
        this.anneeProduction = anneeProduction;
        this.dateCreation = dateCreation;
        
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }

    public int getAnneeProduction() {
        return anneeProduction;
    }

    public void setAnneeProduction(int anneeProduction) {
        this.anneeProduction = anneeProduction;
    }

    public Date getDateCreation() {
        return dateCreation;
    }

    public void setDateCreation(Date dateCreation) {
        this.dateCreation = dateCreation;
    }
    
    
    
    public String getTitre(){
        return titre;
    } 
    
    public void setTitre(String t){
        titre = t;
    }
    
    public void setAnnee(int annee ){
        anneeProduction = annee;
    }
    
    public int getAnnee(){
        return anneeProduction;
    }
    
    public void affiche(){
        
        System.out.println(this.getTitre() + " " + this.getAnneeProduction());
        System.out.println("Synopsis : " + this.getSynopsis());
        System.out.println(this.getDateCreation());
        System.out.println(" ");
    }
   
}
