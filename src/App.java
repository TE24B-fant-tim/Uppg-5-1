import java.util.Scanner;

void main(){
    Scanner scanner = new Scanner(System.in);
    Bil bil1;
    Bil bil2;
    String modell;
    int i_regnummer;
    int i_årsmodell;
    try{
    String märke = IO.readln("Ange märke");
    modell = IO.readln("Ange modell");
    String regnummer = IO.readln("Ange registreringsnummer");
    String årsmodell = IO.readln("Ange årsmodell");
    if(märke == ""){
        throw new IllegalArgumentException("märke är tomt");
    }
    else if( modell == ""){
        throw new IllegalArgumentException("modell är tomt");
    }
    else if( regnummer == ""){
        throw new IllegalArgumentException("registreringsnummer är tomt");
    }
    else if( årsmodell == ""){
        throw new IllegalArgumentException("årsmodell är tomt");
    }
    else{
        i_regnummer = Integer.parseInt(regnummer);
        i_årsmodell = Integer.parseInt(årsmodell);
        bil1 = new Bil(märke, modell, regnummer, i_årsmodell);
        IO.println("Din bil har skapats");
        IO.println(bil1);
    }
    String fart = IO.readln("öka eller bromsa? (1-2) ");
    int i_fart = Integer.parseInt(fart);
    if( i_fart == 1){
        IO.println("hur mycket?" );
        int ökning = Integer.parseInt(scanner.nextLine());
        bil1.ökahastighet(ökning);
    }
    if( i_fart == 2){
        IO.println("hur mycket?");
        int minskning = Integer.parseInt(scanner.nextLine());
        bil1.bromsa(minskning);
    }
}
catch(IllegalArgumentException e){
IO.println("Fel" + e.getMessage());
}
try{ bil2 = new Bil("" ,modell,i_regnummer,i_årsmodell);}
catch(IllegalArgumentException e){
    IO.println("Fel när Bil2 skapades " + e.getMessage());
}

}