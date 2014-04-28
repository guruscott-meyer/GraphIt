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
public class Acot extends OneArgumentFunction {
    
    public Acot() {
        super();
    }
    
    public Acot( Function newFunc ) {
        super( newFunc );
    }
    
    public String getLabel() {
        return "<html>Arccot( </html>" + func.getLabel() + " )";
    }
    
    @Override
    public double getY( double x ) {
        return 1 / Math.atan( func.getY( x ) );
    }
    
}
