package zAltroPackage;

public class ContenitorePeso {

    public static void main(String[] args) {
        
        double var_volume;
        
        PesoContenitore scatolone1 = new PesoContenitore(30, 20, 25, 2.5);
        PesoContenitore scatolone2 = new PesoContenitore();
        PesoContenitore scatolone3 = new PesoContenitore(3, 1);
        Contenitore     scatolone4 = new Contenitore(3, 1);
        
        var_volume = scatolone1.vol();
        System.out.println ("Il volume della scatola 1 è: " + var_volume + ", il suo peso è: " + scatolone1.peso + " kg");
        
        var_volume = scatolone2.vol();
        System.out.println ("Il volume della scatola 2 è: " + var_volume + ", il suo peso è: " + scatolone2.peso + " kg");
        
        System.out.println ("Il volume della scatola 3 è: " + scatolone3.vol() + ", il suo peso è: " + scatolone3.peso + " kg");
        
    }
    
}