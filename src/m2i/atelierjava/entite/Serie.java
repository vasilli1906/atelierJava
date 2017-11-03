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
public class Serie {
    
    private String titre;
    private int anneeSortie;
    private int nbreSaison;
    private String synopsis;
    
    public void initialise(String titre, String synopsis, int anneeSortie, int nbreSaison){
        
        this.titre = titre;
        this.synopsis = synopsis;
        this.anneeSortie = anneeSortie;
        this.nbreSaison = nbreSaison;
        
    }

    public String getTitre() {
        return titre;
    }

    public void setTitre(String titre) {
        this.titre = titre;
    }

    public int getAnneeSortie() {
        return anneeSortie;
    }

    public void setAnneeSortie(int anneeSortie) {
        this.anneeSortie = anneeSortie;
    }

    public int getNbreSaison() {
        return nbreSaison;
    }

    public void setNbreSaison(int nbreSaison) {
        this.nbreSaison = nbreSaison;
    }

    public String getSynopsis() {
        return synopsis;
    }

    public void setSynopsis(String synopsis) {
        this.synopsis = synopsis;
    }
    
    public void affiche(){
        
        System.out.println(this.getTitre() + " " + this.getAnneeSortie());
        System.out.println("Nombre de saisons : " + this.getNbreSaison());
        System.out.println("Synopsis : " + this.getSynopsis());
        System.out.println(" ");
    }
    
}
