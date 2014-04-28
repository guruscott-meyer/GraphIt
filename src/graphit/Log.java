/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphit;

import GraphPanel.Function;

/**
 *
 * @author admin
 */
public class Log extends OneArgumentFunction{
    
    public Log() {
        super();
    }
    
    public Log(Function newFunc ) {
        super( newFunc );
    }
    
    public String getLabel() {
        return "ln( " + func.getLabel() + " )";
    }
    
    public double getY( double x ) {
        if( x == 0 ) x = 0.000000001;
        return Math.log( func.getY( x ) );
    }
    
}
