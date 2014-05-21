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
public class Cos extends OneArgumentFunction {
    
    public Cos() {
        super();
    }
    
    public Cos( Function newFunc ) {
        super( newFunc );
    }
    
    @Override
    public String getLabel() {
        return "cos( " + func.getLabel() + " )";
    }
    
    /**
     *
     * @param x
     * @return
     */
    @Override
    public double getY( double x ) {
        return Math.cos( func.getY( x ) );
    }
}
