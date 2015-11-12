package animals;

import animals.Animal;

public class Au extends Animal implements Terrestre, Aeri {

    public Au(String nom, Animal pare, Animal mare) {
        super(nom, pare, mare);
    }
    
    @Override
    public void volar(){
        System.out.println("El animal "+this.getNom()+" està volant");
    }
    @Override
    public void caminar(){
        System.out.println("El animal "+this.getNom()+" està caminant");
    }
}
