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
        
        Animal desconegut = new Animal("Desconegut");//animal genèric per a animals orfes
        
        Peix flipper = new Peix("Flipper", desconegut, desconegut);
        Peix flapper = new Peix("Flapper", desconegut, desconegut);
        Peix flepper = new Peix("Flepper", flipper, flapper);
        
        flepper.nedar();
        System.out.println(flepper.getDataIngres());
        flepper.transportar(aquari);
        flapper.transportar(aquari);
        flepper.transportar(aquari);
        System.out.println(flepper.getZona());
        System.out.println(flapper.getZona());
        System.out.println(flepper.getZona());
        
        Peix chanquete = new Peix("Chanquete", flipper, flapper);
        
        chanquete.morir();
        
        Zoo zoodeBarcelona = new Zoo("Paquito",12,120);
        zoodeBarcelona.Tancar();
    }
    
}
