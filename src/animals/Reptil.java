package animals;

import animals.Aquatic;
import animals.Animal;

/**
 * Classe que representa un Reptil
 * Hereta de la Classe Animal i
 * Implementa les interfícies Terrestre i Aquatic
 * @author ivan
 */
public class Reptil extends Animal implements Terrestre, Aquatic {

    /**
     * Constructor de la classe Reptil
     * @param nom Nom de l'animal
     * @param pare  Objecte del Animal pare
     * @param mare Objecte del Animal mare
     */
    public Reptil(String nom, Animal pare, Animal mare) {
        super(nom, pare, mare);
    }
    
    /**
     * Implementacio del mètode nedar de la interfície Aquatic
     * @see Aquatic
     */
    @Override
    public void nedar(){
        System.out.println("El animal "+this.getNom()+" està nedant");
    }
    
    /**
     * Implementacio del mètode caminar de la interfície Terrestre
     * @see Terrestre
     */
    @Override
    public void caminar(){
        System.out.println("El animal "+this.getNom()+" està nedant");
    }
}
