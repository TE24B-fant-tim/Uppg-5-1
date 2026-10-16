

public class Bil{
    private String märke;
    private String modell;
    private String registreringsnummer;
    private int årsmodell;
    int hastighet;
      
    public Bil(String märke, String modell,String registreringsnummer, int årsmodell){
        this.märke = märke;
        if(märke == null || modell.isBlank()){
            throw new IllegalArgumentException("märke är tomt");
        }
        this.modell = modell;
        if( modell == null || modell.isBlank()){
            throw new IllegalArgumentException("modell är tomt");
        }
        this.registreringsnummer= registreringsnummer;
        if(registreringsnummer == null || registreringsnummer.isBlank()){
            throw new IllegalArgumentException("registreringsnummer får inte vara tomt");
        }
        this.årsmodell = årsmodell;
    }
    public String getmärke(){
        return märke;
    }
    public String getmodell(){
        return modell;
    }
    public int gethastighet(){
        return hastighet;
    }
    public void ökahastighet(int ökning){
        if(ökning <= 0){
            throw new IllegalArgumentException("Ökning får inte vara tom");
        }
        hastighet += ökning;
    }
    public void bromsa(int minskning){
        if(minskning <= 0){
            throw new IllegalArgumentException("Minskning får inte vara tom");
        }
        hastighet += minskning;
        if(hastighet < 0){
            hastighet = 0;
        }
    }
    public String toString(){
        return "Bil{" + "Märke" + märke +
        "modell" + modell + 
        "registreringsnummer" + registreringsnummer + 
        "årsmodell" + årsmodell + 
        "hastighet" + hastighet;
    }
}

