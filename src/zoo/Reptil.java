package zoo;

public class Reptil extends Animal implements Terrestre, Aquatic {

    public Reptil(String nom, Animal pare, Animal mare) {
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
