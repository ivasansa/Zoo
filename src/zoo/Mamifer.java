package zoo;

public class Mamifer extends Animal implements Aquatic, Terrestre {
    
    @Override
    public void reproduccio(){

    //diferida?
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
