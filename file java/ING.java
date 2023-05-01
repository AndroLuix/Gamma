package md.corsojava;

public class ING extends Banca {
    
    @Override
    int get_tasso_interesse() {
        calcola_interesse_passivo();
        return 8;
    }
}