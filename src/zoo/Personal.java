package zoo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public abstract class Personal {
    private String DNI;
    private String nom;
    private Date dataIngres;
    private Date dataSortida;
    
    public void Acomiadar(){
    Calendar c = new GregorianCalendar();
    c.set(Calendar.HOUR_OF_DAY, 0); //anything 0 - 23
    c.set(Calendar.MINUTE, 0);
    c.set(Calendar.SECOND, 0);
    Date d1 = c.getTime(); //the midnight, that's the first second of the day.
    this.dataSortida = d1;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public Date getDataIngres() {
        return dataIngres;
    }

    public void setDataIngres(Date dataIngres) {
        this.dataIngres = dataIngres;
    }

    public Date getDataSortida() {
        return dataSortida;
    }

    public void setDataSortida(Date dataSortida) {
        this.dataSortida = dataSortida;
    }
    
    
}
