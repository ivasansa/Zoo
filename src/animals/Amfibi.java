package animals;

/**
 * Classe que representa un Amfibi
 * Hereta de la Classe Animal i
 * Implementa les interfícies Aquatic i Terrestre
 * @author ivan
 */
public class Amfibi extends Animal implements Aquatic, Terrestre {

    /**
     * Constructor de la classe Amfibi
     * @param nom Nom de l'animal
     * @param pare  Objecte del Animal pare
     * @param mare Objecte del Animal mare
     */
    public Amfibi(String nom, Animal pare, Animal mare) {
        super(nom, pare, mare);
    }
    /**
     * Constructor sobrecarregat de la classe Amfibi
     * @param nom 
     */
    public Amfibi(String nom){
        super(nom);
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
        System.out.println("El animal "+this.getNom()+" està caminant");
    }
}
