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
public class Csc extends Function {
    
    public Csc() {
        super( new double[] { 0.0, 0.0, 0.0, 0.0 } );
        label = "<html><i>y</i> = a + bcsc( c<i>x</i> + d )";
    }
    
    public Csc( double params[] ) {
        super( params );
        label = "<html><i>y</i> = a + bcsc( c<i>x</i> + d )";
    }
    
    @Override
    public double getY( double x ) {
        return Params[0] + Params[1] / Math.cos( Params[2] * x + Params[3] );
    }
    
}
