package zoo;

public class Reptil extends Animal implements Terrestre, Aquatic {
    
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
