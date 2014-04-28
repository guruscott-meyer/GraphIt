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
public class Acos extends OneArgumentFunction {
    
    public Acos() {
        super();
    }
    
    public Acos( Function newFunc ) {
        super( newFunc );
    }
    
    public String getLabel() {
        return "<html>Arccos( </html>" + func.getLabel() + " )";
    }
    
    @Override
    public double getY( double x ) {
        return Math.acos( func.getY( x ) );
    }
    
}
