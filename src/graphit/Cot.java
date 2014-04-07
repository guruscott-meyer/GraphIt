/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphit;

import java.lang.Math;

/**
 *
 * @author admin
 */
public class Cot extends Formula{
    
    public Cot() {
        super();
        label = "<html><i>y</i> = acotb<i>x</i>";
    }
    
    public Cot( double params[] ) {
        super( params );
        label = "<html><i>y</i> = acotb<i>x</i>";
    }
    
    public double getY( double x ){
        return Params[0] / Math.tan( Params[1] * x );
    }
}
