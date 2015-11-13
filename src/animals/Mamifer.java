package animals;

import animals.Aquatic;
import animals.Animal;

/**
 * Classe que representa a una Mamífer
 * Hereta de la classe Animal i
 * implementa les interficies Aquàtic i Terrestre
 * 
 */
public class Mamifer extends Animal implements Aquatic, Terrestre {

    public Mamifer(String nom, Animal pare, Animal mare) {
        super(nom, pare, mare);
    }
      
     /**
     * Implementació del mètode nedar de la interficie Aquàtic
     * @see Aquatic
     */
    @Override
    public void nedar(){
        System.out.println("El animal"+this.getNom()+" està nedant");
    }
     /**
     * Implementació del mètode nedar de la interficie Terrrestre
     * @see Terrestre
     */
    @Override
    public void caminar(){
        System.out.println("El animal"+this.getNom()+" està caminant");
    }
}