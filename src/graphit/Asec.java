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
public class Asec extends OneArgumentFunction {
    
    public Asec() {
        super();
    }
    
    public Asec( Function newFunc ) {
        super( newFunc );
    }
    
    public String getLabel() {
        return "<html>Arcsec( </html>" + func.getLabel() + " )";
    }
    
    @Override
    public double getY( double x ) {
        return 1 / Math.asin( func.getY( x ) );
    }
    
}
