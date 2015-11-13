package zoo;
import animals.*;

public class Main {

   
    public static void main(String[] args) {
        
        Cuidador pepe = new Cuidador(0001, "Encarregat");
        pepe.setNom("Pepe");
        pepe.setDNI("52145632K");
        Veterinari joseLuis = new Veterinari(0001, "Veterinari");
        joseLuis.setNom("Jose Luis");
        joseLuis.setDNI("54125784A");
        
        Zona aquari = new Zona(0001, "Aquari", 3000, false);
        pepe.Acomiadar();
       
        
    }
    
}
