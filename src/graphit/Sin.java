/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphit;

import GraphPanel.Function;
import java.lang.Math;

/**
 *
 * @author admin
 */
public class Sin extends OneArgumentFunction {
    
    public Sin() {
        super();
    }
    
    public Sin( Function newFunc ) {
        super( newFunc );
    }
    
    public String getLabel() {
        return "sin( " + func.getLabel() + " )";
    }
    
    /**
     *
     * @param x
     * @return
     */
    @Override
    public double getY( double x ) {
        return Math.sin( func.getY( x ) );
    }
}
