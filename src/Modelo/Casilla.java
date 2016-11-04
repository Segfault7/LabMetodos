
package Modelo;

import javax.swing.JButton;

/**
 *
 * @author Usuario
 */
public class Casilla extends JButton{
    private int tipo;
    private int altura;
    private boolean caminable;
    private boolean disponible;
    
    //Constructor
    public Casilla(){
        this.disponible = true;
        this.altura = 1;
        this.caminable = true;
        this.tipo = 1;
        
    }
    public Casilla(int tipoC, int alturaC, boolean caminableC, boolean disponibleC){
        this.disponible = disponibleC;
        this.altura = alturaC;
        this.caminable = caminableC;
        this.tipo = tipoC;
                
                
                
        
    }
    
}