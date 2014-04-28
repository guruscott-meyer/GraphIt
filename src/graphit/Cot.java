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
public class Cot extends OneArgumentFunction{
    
    public Cot() {
        super();
    }
    
    public Cot( Function newFunc ) {
        super( newFunc );
    }
    
    public String getLabel() {
        return "<html>cot( </html>" + func.getLabel() + " )";
    }
    
    public double getY( double x ){
        return 1 / Math.tan( func.getY( x ) );
    }
}
