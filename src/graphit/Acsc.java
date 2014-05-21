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
public class Acsc extends OneArgumentFunction {
    
    public Acsc() {
        super();
    }
    
    public Acsc( Function newFunc ) {
        super( newFunc );
    }
    
    public String getLabel() {
        return "Arccsc( " + func.getLabel() + " )";
    }
    
    @Override
    public double getY( double x ) {
        return 1 / Math.acos( func.getY( x ) );
    }
    
}
