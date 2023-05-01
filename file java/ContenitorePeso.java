package md.corsojava;

class PesoContenitore extends Contenitore {
    double peso; 
    
    //costruttore per PesoContenitore
    PesoContenitore (double larg, double alt, double prof, double peso) {
        altezza = alt;
        larghezza = larg;
        profondita = prof;
        this.peso = peso;
    }
    
    // costruttore in caso le dimensioni non siano specificate
    PesoContenitore () {
         larghezza = -1;
           altezza = -1;
        profondita = -1;
              peso = -1;
    }
    
    // definisco il costruttore per un cubo
    PesoContenitore (double dimensione, double p) {
         larghezza = altezza = profondita = dimensione;
         peso = p;
    }
}

public class ContenitorePeso {

    public static void main(String[] args) {
        
        double var_volume;
        
        PesoContenitore scatolone1 = new PesoContenitore(30, 20, 25, 2.5);
        PesoContenitore scatolone2 = new PesoContenitore(35, 45, 22, 6.2);
        Contenitore scatolone3 = new Contenitore(30.2, 25.6, 12.2);
        Contenitore scatolone4 = new Contenitore();
        
        
        var_volume = scatolone1.vol();
        System.out.println ("Il volume della scatola 1 è: " + var_volume + ", il suo peso è: " + scatolone1.peso + " kg");
        
        var_volume = scatolone2.vol();
        System.out.println ("Il volume della scatola 2 è: " + var_volume + ", il suo peso è: " + scatolone2.peso + " kg");
                
        scatolone3 = scatolone1;          // sì perché sottoclasse
        //scatolone1 = scatolone3;        // no per tipologia incompatibile
        //scatolone3 = scatolone4;        // sì perché stessa tipologia
        //Animali mioanimale = new Animali();
        //scatolone3 = mioanimale;        // no per tipologia incompatibile
        
        var_volume = scatolone3.vol();
        System.out.println ("Il volume della scatola 3 è: " + var_volume);
        //System.out.println ("Il suo peso è: " + scatolone3.peso + " kg");
     
    }
    
}