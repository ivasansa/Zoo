package zoo;
import animals.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        
        //Creació de Zoo
        Zoo zoo = new Zoo("Barcelona",12,120);
        
        //Creació de cuidador
        Cuidador cuidador1 = new Cuidador(0001, "Encarregat");
        cuidador1.setNom("Pepe");
        cuidador1.setDNI("52145632K");
        
        //Creació de veterinari
        Veterinari veterinari1 = new Veterinari(0001, "Veterinari");
        veterinari1.setNom("Jose Luis");
        veterinari1.setDNI("54125784A");
     
        //creació zona
        Zona aquari = new Zona(0001, "Aquari", 3000, false);
        //neteja zona
        cuidador1.netejarGabia(aquari);
        //creació peix
        Peix flipper = new Peix("Flipper");
        Peix flapper = new Peix("Flapper");
        //creació peix amb pare i mare
        Peix flepper = new Peix("Flepper", flipper, flapper);
        //transportar animal a una zona
        flipper.transportar(aquari);
        flapper.transportar(aquari);
        flepper.transportar(aquari);
        System.out.println(flepper.getZona());
        
        //cuidador neteja i alimenta animal
        flapper.setTeGana(true);
        flapper.setDieta("placton");
        cuidador1.alimentarAnimal(flapper);
        cuidador1.netejarAnimal(flapper);
        //veterinari cura Animal
        flapper.setMalalt(true);
        veterinari1.curarAnimal(flapper);
        //interacció animal
        flepper.nedar();
        
       //El Zoo plega
        zoo.Tancar();
        
       //ArrayList<Animal> ListaAnimales;
       //ListaAnimales = new ArrayList<Animal>();
       Mamifer paquito = new Mamifer("paquito");
       Reptil manolito = new Reptil("manolito");
       Au pepito = new Au("pepito");
       Amfibi joselito = new Amfibi("joselito");
        
       ArrayList<Animal> ListaAnimales = new ArrayList<Animal>();

        ListaAnimales.add(flapper);
        ListaAnimales.add(paquito);
        ListaAnimales.add(manolito); 
        ListaAnimales.add(pepito); 
        ListaAnimales.add(joselito);

        for (Animal aux : ListaAnimales){
            System.out.println(aux);
        }
        
    }
    
}
