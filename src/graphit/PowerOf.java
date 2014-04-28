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
public class PowerOf extends TwoArgumentFunction {
    
    public PowerOf() {
        super();
    }
    
    public PowerOf( Function newFuncA, Function newFuncB ) {
        super( newFuncA, newFuncB );
    }
    
    public String getLabel() {
        return "(" + funcA.getLabel() + ")<sup>" + funcB.getLabel() + "</sup>";
    }
    
    public double getY( double x ) {
        return Math.pow( funcA.getY( x ), funcB.getY( x ) );
    }
    
}
