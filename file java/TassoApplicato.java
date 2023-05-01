package md.corsojava;

public class TassoApplicato {
    public static void main(String args[]){    
        
        //Banca mia_banca = new Banca(); 
        
        Banca mia_banca;
        
        mia_banca = new BancaEtica();
        System.out.println("Il tasso di interesse applicato da Banca Etica è: "+ mia_banca.get_tasso_interesse()+ "%");    
        
        mia_banca = new ING();  
        System.out.println("Il tasso di interesse applicato da ING è: "+ mia_banca.get_tasso_interesse()+ "%");    

    }
}
