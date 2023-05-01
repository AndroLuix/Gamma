package md.corsojava;

abstract class Banca {    
    
    private int var_classe;
    int var_classe_pubblica;
    final int var_classe_costante = 3;
    
    abstract int get_tasso_interesse();
     
     //int get_saldo(int p_num_cliente, int p_num_cc);
    
    void calcola_interesse_attivo () {
        System.out.print("sono dentro interesse attivo - ");
        //var_classe = 4;
    }
    
    void calcola_interesse_passivo () {
        System.out.print("sono dentro interesse passivo - ");
        //var_classe = 4;
    }
    
    void calcola_saldo () {
    }    
}























