package animals;

import animals.Animal;

/**
 * Classe que representa un Au
 * @author ivan
 */
public class Au extends Animal implements Terrestre, Aeri {

    /**
     * Constructor de la classe Au
     * @param nom Nom de l'animal
     * @param pare  Objecte del Animal pare
     * @param mare Objecte del Animal mare
     */
    public Au(String nom, Animal pare, Animal mare) {
        super(nom, pare, mare);
    }
    
    /**
     * Implementacio del mètode volar de la interfície Aeri
     * @see Aeri
     */
    @Override
    public void volar(){
        System.out.println("El animal "+this.getNom()+" està volant");
    }
    
    /**
     * Implementacio del mètode caminar de la interfície Terrestre
     * @see Terrestre
     */
    @Override
    public void caminar(){
        System.out.println("El animal "+this.getNom()+" està caminant");
    }
}
