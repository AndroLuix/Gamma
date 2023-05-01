package zAltroPackage;

class PesoContenitore extends Contenitore {
    double peso; 
    
    //costruttore per PesoContenitore
    PesoContenitore (double larg, double alt, double prof, double peso) {
        /*il seguente codice è sostituito da super()
        * larghezza = larg;
        * altezza = alt;
        * profondita = prof;
        */
        
        super(larg, alt, prof);
        this.peso = peso;
    }
    
    // costruttore di default, in caso le dimensioni non siano specificate
    PesoContenitore () {
        super();
        this.peso = -1;
    }
    
    // definisco il costruttore per un cubo
    PesoContenitore (double dimensione, double p) {
         super(dimensione);
         peso = p;
    }

    // definisco il costruttore per un cubo
    PesoContenitore (int lato, double p) {
         super(lato);
         peso = p;
    }

    // definisco il costruttore per un 2D
    PesoContenitore (double larg, double alt, double p) {
         super(larg, alt);
         peso = p;
    }
}