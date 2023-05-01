package md.corsojava;

import java.io.*; 

public class LetturaFile {

    public static void main(String[] args) {
        // lettura di file un carattere alla volta
        String var_nome_file = "C:\\temp\\fileprova.txt";
        try {    
            FileInputStream file_lettura = new FileInputStream(var_nome_file);    

            int i = file_lettura.read();  
            System.out.print((char)i);    
  
            file_lettura.close();    
          } catch(Exception e){
              System.out.println(e);
          } 
    }
}

/********************************************************************
// Prima modalità
// lettura di file un carattere alla volta
        try {    
            FileInputStream file_lettura = new FileInputStream("C:\\temp\\fileprova.txt");    

            int i = file_lettura.read();  
            System.out.print((char)i);    
  
            file_lettura.close();    
          } catch(Exception e){
              System.out.println(e);
          }    
    }  
*/

/********************************************************************
// Seconda modalità
        // lettura di file un carattere alla volta FINO a fine file
        try {    
            FileInputStream file_lettura = new FileInputStream("C:\\temp\\fileprova.txt");    
            int i = 1; 
            
            i = file_lettura.read();
            while(i != -1){ 
                System.out.print((char)i);    
                i = file_lettura.read();
            }    
            
            /*while((i = file_lettura.read())!= -1){ 
                System.out.print((char)i);    
            }*//*
            
            file_lettura.close();    
            
          } catch(Exception e){
              System.out.println(e);
          }    
    }  
*/

/********************************************************************
// Terza modalità
        // Lettura di una riga del file
        try {    
            BufferedReader file_lettura = new BufferedReader(new FileReader("C:\\temp\\fileprova.txt"));
            String riga;
            riga = file_lettura.readLine();
            
            while(riga != null) {                       //se riga==null -> file finito
                System.out.println(riga);
                riga = file_lettura.readLine();
            }
            
            file_lettura.close();

        } catch(Exception e){
              System.out.println(e);
        } 
    }       
        
*/

/********************************************************************
// Lettura file con sostituzione dicaratteri a video
        try {
            BufferedReader file_lettura = new BufferedReader(new FileReader("C:\\temp\\catalogoprodotti.txt"));
            
            String riga;
            
            riga = file_lettura.readLine();
            
            while(riga != null) {
                System.out.println(riga.replaceAll(";", " - "));
                riga = file_lettura.readLine();
            }  
            file_lettura.close(); 
        } 
        catch(IOException e){
            System.out.println(e);
        }        
*/
/* *******************************************************************
// Split (guardare anche charat, indexof, substring
        try {
            BufferedReader file_lettura = new BufferedReader(new FileReader("C:\\temp\\catalogoprodotti.txt"));
        
            String riga;
                       
            riga = file_lettura.readLine();  //leggo prima riga
            
            String var_riga_array []; //split  prima riga
            //splitta la riga letta - è brutto ripetere la stessa istruzione, 
            //in questo momento, per spiegare la split, la teniamo
            var_riga_array = riga.split(";");    
            
            while(riga != null) {
                
                System.out.println("riga:" + riga + "<");
                var_riga_array = riga.split(";");    //splitta la riga letta

                //System.out.println("quantità:" + var_riga_array[3] + "<");
                
                for (String var_temp_elemento: var_riga_array) {
            
                    System.out.println("il valore:" + var_temp_elemento + "<");
                }
                riga = file_lettura.readLine();
            }
            
            file_lettura.close(); 
        } 
        catch(IOException e){
            System.out.println(e);
        }   
    }  
*/
/********************************************************************



/********************************************************************
// OPZIONE DO WHILE
        // Lettura file con sostituzione dicaratteri a video
        try {
            BufferedReader file_lettura = new BufferedReader(new FileReader("C:\\temp\\catalogoprodotti.txt"));
            
            String riga;
            
            do {
                riga = file_lettura.readLine();
                if (riga != null) {
                    System.out.println(riga.replaceAll(";", " - "));
                }
                
            } while (riga != null);
            
            file_lettura.close(); 
        } 
        catch(IOException e){
            System.out.println(e);
        }    
    }  
*/