package zoo;

public class Amfibi extends Animal implements Aquatic, Terrestre {
    
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
