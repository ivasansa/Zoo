package animals;

import animals.Aquatic;
import animals.Animal;

public class Mamifer extends Animal implements Aquatic, Terrestre {

    public Mamifer(String nom, Animal pare, Animal mare) {
        super(nom, pare, mare);
    }
    
    
    
    @Override
    public void nedar(){
        System.out.println("Nedant");
    }
    @Override
    public void caminar(){
        System.out.println("Caminant");
    }
}
