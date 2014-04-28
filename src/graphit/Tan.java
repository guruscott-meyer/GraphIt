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
public class Tan extends OneArgumentFunction {
    
    public Tan() {
        super();
    }
    
    public Tan( Function newFunc ) {
        super( newFunc );
    }
    
    public String getLabel() {
        return "<html>tan( </html>" + func.getLabel() + " )";
    }
    
    /**
     *
     * @param x
     * @return
     */
    @Override
    public double getY( double x ) {
        return Math.tan( func.getY( x ) );
    }
    
}
