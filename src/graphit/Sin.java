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
public class Sin extends Formula {
    
    public Sin() {
        super();
        label = "<html><i>y</i> = asinb<i>x</i>";
    }
    
    public Sin( double Params[] ) {
        super( Params );
        label = "<html><i>y</i> = asinb<i>x</i>";
    }
    
    /**
     *
     * @param x
     * @return
     */
    @Override
    public double getY( double x ) {
        return Params[0] * Math.sin( Params[1] * x );
    }
}
