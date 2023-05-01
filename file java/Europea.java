/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package md.corsojava;

/**
 *
 * @author margh
 */
class Europea implements BancaInterfaccia, BancaInterfaccia2 {  
    
    @Override
    public double var_tasso_interesse(){
        return 9.7;
    }  

    @Override
    public double var_tasso_interesse2(){
        return 5.2;
    } 
}
