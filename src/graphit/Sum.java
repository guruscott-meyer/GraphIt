/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphit;

import GraphPanel.Function;
import java.awt.Color;

/**
 *
 * @author admin
 */
public class Sum extends TwoArgumentFunction {
    
    public Sum() {
        super();
    }
    
    public Sum( Function newFuncA, Function newFuncB ) {
        super( newFuncA, newFuncB );
    }
    
    public String getLabel() {
        return funcA.getLabel() + " + " + funcB.getLabel();
    }
    
    public double getY( double x ) {
        return funcA.getY( x ) + funcB.getY( x );
    }
}
