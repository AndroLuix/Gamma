package md.corsojava;

public class TassoApplicatoInterfaccia {

    public static void main(String[] args) {
        
        BancaInterfaccia mia_bancaIT  = new Italia();  
        
        System.out.println("Il tasso di interesse applicato è:" + mia_bancaIT.var_tasso_interesse()+ "%");  
        
        BancaInterfaccia2 mia_bancaEU = new Europea();  
                
        System.out.println("Il tasso di interesse applicato è:" + mia_bancaEU.var_tasso_interesse()+ "%");  
    }

}
