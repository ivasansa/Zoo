package zoo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
/**
 * Classe que representa la classe Personal
 * Classe abstracta
 * @author sergio
 */
public abstract class Personal {
    
    private String DNI;
    private String nom;
    private Date dataIngres;
    private Date dataSortida;
    /**
     * Mètode Acomidar que inicialitza la data de sortida a la data actual 
     */
    public void Acomiadar(){
    Calendar c = new GregorianCalendar();
    c.set(Calendar.HOUR_OF_DAY, 0); //anything 0 - 23
    c.set(Calendar.MINUTE, 0);
    c.set(Calendar.SECOND, 0);
    Date d1 = c.getTime(); //the midnight, that's the first second of the day.
    this.dataSortida = d1;
    }
    /**
     * Getter del atribut DNI
     * @return DNI que retorna el DNI de la Classe Personal
     */
    public String getDNI() {
        return DNI;
    }
    /**
     * Setter del atribut DNI
     * @param DNI que es un String de la Classe Personal
     */
    public void setDNI(String DNI) {
        this.DNI = DNI;
    }
    /**
     * Getter del atribut nom
     * @return nom que retorna el nom de la Classe Personal
     */
    public String getNom() {
        return nom;
    }
    /**
     * Setter del atribut Nom
     * @param nom que es un string de la Classe Personal 
     */
    public void setNom(String nom) {
        this.nom = nom;
    }
    /**
     * Getter del atribut dataIngres
     * @return dataIngres que retorna la dataIngres de la Classe Personal
     */
    public Date getDataIngres() {
        return dataIngres;
    }
    /**
     * Setter del atribut dataIngres
     * @param dataIngres que es un objete de tipus Date de la Classe Personal 
     */
    public void setDataIngres(Date dataIngres) {
        this.dataIngres = dataIngres;
    }
    /**
     * Getter del atribut dataSortida
     * @return dataSortida que retorna la dataIngres de la Classe Personal
     */
    public Date getDataSortida() {
        return dataSortida;
    }
    /**
     * Setter del atribut dataSortida
     * @param dataSortida que es un objecte de tipus Date de la Classe Personal
     */
    public void setDataSortida(Date dataSortida) {
        this.dataSortida = dataSortida;
    }
    
    
}
