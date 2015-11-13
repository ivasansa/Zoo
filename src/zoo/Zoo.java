package zoo;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 * Classe que representa a Zoo
 * @author sergio
 */

public class Zoo {
    private String nom;
    private int id;
    private Date dataCreacio; 
    private int aforament;
    /**
     * Getter del atribut Nom
     * @return nom que retorna el nom de la Classe Zoo
     */

    public String getNom() {
        return nom;
    }
    /**
     * Setter del atribut nom
     * @param nom que es un string de la Classe Zoo
     */

    public void setNom(String nom) {
        this.nom = nom;
    }
    /**
     * Getter del atribut Id
     * @return id que retorna la id de la Classe Zoo
     */
    public int getId() {
        return id;
    }
    /**
     * Setter del atribut id
     * @param id que es un int de la Classe Zoo
     */
    public void setId(int id) {
        this.id = id;
    }
    /**
     * Getter del atribut Aforament
     * @return aforament que retorna el aforament de la Classe Zoo
     */
    public int getAforament() {
        return aforament;
    }
    /**
     * Setter del atribut Aforament
     * @param aforament que es un int de la Classe Zoo
     */
    public void setAforament(int aforament) {
        this.aforament = aforament;
    }
    /**
     * Getter del atribut dataCreacio
     * @return dataCreacio que retorna la dataCreacio de la Classe Zoo
     */
    public Date getDataCreacio() {
        return dataCreacio;
    }
    /**
     * Setter del atribut dataCreacio
     * @param dataCreacio que es un objecte Date de la Classe Zoo
     */
    public void setDataCreacio(Date dataCreacio) {
        this.dataCreacio = dataCreacio;
    }
    /**
     * Constructor de la Classe Zoo
     * @param nom que es un atribut string de la Classe Zoo
     * @param id que es un atribut int de la Classe Zoo
     * @param aforament que es un atribut int de la Classe Zoo
     */
    public Zoo(String nom, int id, int aforament) {
        this.nom = nom;
        this.id = id;
        this.aforament = aforament;
        Calendar c = new GregorianCalendar();
        c.set(Calendar.HOUR_OF_DAY, 0); //anything 0 - 23
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        Date d1 = c.getTime(); //the midnight, that's the first second of the day.
        this.dataCreacio = d1;
        
        SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy");
        String aux = sdf.format(d1);
        
        System.out.println("El Zoo "+ nom + " s'ha inaugurat el día "+aux) ;
    }
     /**
      * Mètode de la Classe Zoo que inicialitza la dataCreacio a la data Actual
      */
        public void Tancar(){
        Calendar c = new GregorianCalendar();
        c.set(Calendar.HOUR_OF_DAY, 0); //anything 0 - 23
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        Date d1 = c.getTime(); //the midnight, that's the first second of the day.
        this.dataCreacio = d1;
        SimpleDateFormat sdf = new SimpleDateFormat("d MMM yyyy");
        String aux = sdf.format(d1);
        System.out.println("El Zoo "+ nom + " ha tancat les portes el día "+aux) ;
    }
    
}
