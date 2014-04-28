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
public class Atan extends OneArgumentFunction {
    
    public Atan() {
        super();
    }
    
    public Atan( Function newFunc ) {
        super( newFunc );
    }
    
    public String getLabel() {
        return "<html>Arctan( </html>" + func.getLabel() + " )";
    }
    
    @Override
    public double getY( double x ) {
        return Math.atan( func.getY( x ) );
    }
    
}
