package zoo;

public class Amfibi extends Animal implements Aquatic, Terrestre {

    public Amfibi(String nom, Animal pare, Animal mare) {
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
