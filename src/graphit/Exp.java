/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphit;

import GraphPanel.Function;

/**
 *
 * @author admin
 */
public class Exp extends OneArgumentFunction {
    
    public Exp() {
        super();
    }
    
    public Exp( Function newFunc ) {
        super( newFunc );
    }
    
    public String getLabel() {
        return "E<sup>" + func.getLabel() + "</sup>";
    }
    
    public double getY( double x ) {
        return Math.exp( x );
    }
}
