package zoo;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Veterinari extends Personal {
    private int ID;
    private String rang;
    
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
    
    public void curarAnimal(Animal a){
        if(a.isMalalt()){
            a.setMalalt(false);
            System.out.println("El veterinari " + this.getNom() +" ha curat l'animal " + a.getNom());
        }
    }
}
