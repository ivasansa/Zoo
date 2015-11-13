package animals;

import animals.Aquatic;
import animals.Animal;

/**
 * Classe que representa un Peix
 * Hereta de la Classe Animal i
 * Implementa la interfície Aquatic
 * @author ivan
 */
public class Peix extends Animal implements Aquatic {
    
    /**
     * Constructor de la classe Peix
     * @param nom Nom de l'animal
     * @param pare  Objecte del Animal pare
     * @param mare Objecte del Animal mare
     */
    public Peix(String nom, Animal pare, Animal mare) {
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

}
