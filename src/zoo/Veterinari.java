package zoo;

import animals.Animal;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Classe que representa un Veterinari
 * Hereta de la Classe Personal
 * @author ivan
 */
public class Veterinari extends Personal {
    private int ID;
    private String rang;
    
    /**
     * Constructor de la classe Veterinari
     * Inicialitza l'atribut dataIngres a la data actual
     * @param ID Identificador de Veterinari
     * @param rang Rang jeràrquic del Veterinari
     */
    public Veterinari(int ID, String rang) {
        this.ID = ID;
        this.rang = rang;

        Calendar c = new GregorianCalendar();
        c.set(Calendar.HOUR_OF_DAY, 0); //anything 0 - 23
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        Date d1 = c.getTime(); //the midnight, that's the first second of the day.
        this.setDataIngres(d1);
    }
    
    /**
     * Métode que posa a false l'atribut isMalalt de la classe Animal
     * @param a Objecte Animal a curar
     */
    public void curarAnimal(Animal a){
        if(a.isMalalt()){
            a.setMalalt(false);
            System.out.println("El veterinari " + this.getNom() +" ha curat l'animal " + a.getNom());
        }
    }
}
