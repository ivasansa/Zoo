package zoo;

import animals.Animal;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Classe que representa un Cuidador
 * Hereta de la Classe Personal
 * @author ivan
 */
public class Cuidador extends Personal {
    private int ID;
    private String rang;
    
    /**
     * Constructor de la classe Cuidador
     * Inicialitza l'atribut dataIngres a la data actual
     * @param ID Identificador de Cuidador
     * @param rang Rang jeràrquic del cuidador
     */
    public Cuidador(int ID, String rang) {
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
     * Mètode que posa l'atribut Net de la Classe Zona a true
     * Treu per pantalla una frase informativa
     * @param z Objecte 
     */
    public void netejarGabia(Zona z){
        if(!z.isNet()){
            z.setNet(true);
            System.out.println("El cuidador " + this.getNom() +" ha netejat la zona " + z.getNom());
        }
    }
    
    /**
     * Mètode que posa l'atribut Net de la Classe Zona a true
     * Treu per pantalla una frase informativa
     * @param a 
     */
    public void netejarAnimal(Animal a){
        if(!a.isNet()){
            a.setNet(true);
            System.out.println("El cuidador " + this.getNom() +" ha netejat l'animal " + a.getNom());
        }
    }
    
    public void alimentarAnimal(Animal a) {
        if(a.isTeGana()){
            a.setTeGana(false);
            System.out.println("El cuidador " + this.getNom() +" ha alimentat l'animal " + a.getNom() + " amb " + a.getDieta());
        }
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getRang() {
        return rang;
    }

    public void setRang(String rang) {
        this.rang = rang;
    }
    
    
    
}
