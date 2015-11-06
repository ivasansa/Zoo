package zoo;

public class Au extends Animal implements Terrestre, Aeri {
    
    @Override
    public void reproduccio(){

    //diferida?
    }
    
    @Override
    public void volar(){
        System.out.println("Volant");
    }
    @Override
    public void caminar(){
        System.out.println("Caminant");
    }
}
