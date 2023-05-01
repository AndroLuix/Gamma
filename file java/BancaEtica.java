package md.corsojava;

public class BancaEtica extends Banca {

    @Override
    int get_tasso_interesse() {
        calcola_interesse_attivo();
        return 7;
    }
}