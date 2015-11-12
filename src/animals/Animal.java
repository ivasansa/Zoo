package animals;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;
import zoo.Zona;

public class Animal {
    private Date dataIngres;
    private Sexe sexe;
    private Date dataSortida;
    private int ID;
    private String nomCientific;
    private String nom;
    private boolean malalt;
    private boolean net;
    private boolean teGana;
    private String dieta;
    private Zona zona;
    private Animal pare;
    private Animal mare;

    public Animal(String nom, Animal pare, Animal mare) {
        this.nom = nom;
        this.pare = pare;
        this.mare = mare;
        
        Calendar c = new GregorianCalendar();
        c.set(Calendar.HOUR_OF_DAY, 0); //anything 0 - 23
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        Date d1 = c.getTime(); //the midnight, that's the first second of the day.
        this.dataIngres = d1;
        
        
        
    }
    public Animal(String nom) {
        this.nom = nom;
        
        Calendar c = new GregorianCalendar();
        c.set(Calendar.HOUR_OF_DAY, 0); //anything 0 - 23
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        Date d1 = c.getTime(); //the midnight, that's the first second of the day.
        this.dataIngres = d1;
        
        
    }
    
    public Sexe getSexe() {
        return sexe;
    }

    public void setSexe(Sexe sexe) {
        this.sexe = sexe;
    }

    public Animal getPare() {
        return pare;
    }

    public void setPare(Animal pare) {
        this.pare = pare;
    }

    public Animal getMare() {
        return mare;
    }

    public void setMare(Animal mare) {
        this.mare = mare;
    }

    
    
    
    public boolean isTeGana() {
        return teGana;
    }

    public void setTeGana(boolean teGana) {
        this.teGana = teGana;
    }

    
    
    public boolean isNet() {
        return net;
    }

    public void setNet(boolean net) {
        this.net = net;
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

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public String getNomCientific() {
        return nomCientific;
    }

    public void setNomCientific(String nomCientific) {
        this.nomCientific = nomCientific;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public boolean isMalalt() {
        return malalt;
    }

    public void setMalalt(boolean malalt) {
        this.malalt = malalt;
    }

    public String getDieta() {
        return dieta;
    }

    public void setDieta(String dieta) {
        this.dieta = dieta;
    }

    public Zona getZona() {
        return zona;
    }

    public void setZona(Zona zona) {
        this.zona = zona;
    }
    
    
    
    
    public void morir(){
        Calendar c = new GregorianCalendar();
        c.set(Calendar.HOUR_OF_DAY, 0); //anything 0 - 23
        c.set(Calendar.MINUTE, 0);
        c.set(Calendar.SECOND, 0);
        Date d1 = c.getTime(); //the midnight, that's the first second of the day.
        this.dataSortida = d1;
    }
    
    public void transportar(Zona z){
        this.zona = z;
        System.out.println("L'animal " + nom + " ha estat traslladat a la zona " + z.getNom());
    }
    
    
}

enum Sexe {
    MASCLE, FEMELLA;
}
