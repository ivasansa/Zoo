package zoo;

public class Peix extends Animal implements Aquatic {

    public Peix(String nom, Animal pare, Animal mare) {
        super(nom, pare, mare);
    }
    
    
    @Override
    public void nedar(){
        System.out.println("Nedant");
    }

}
