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
public class Sec extends Formula {
    
    public Sec() {
        super();
        label = "<html><i>y</i> = asecb<i>x</i>";
    }
    
    public Sec( double params[] ) {
        super( params );
        label = "<html><i>y</i> = asecb<i>x</i>";
    }
    
    public double getY( double x ) {
        return Params[0] / Math.sin( Params[1] * x );
    }
}
