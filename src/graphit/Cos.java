/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphit;

import GraphPanel.Formula;
import java.lang.Math;

/**
 *
 * @author admin
 */
public class Cos extends Formula {
    
    public Cos() {
        super();
        label = "<html><i>y</i> = a + bcos( c<i>x</i> + d )";
    }
    
    public Cos( double params[] ) {
        super( params );
        label = "<html><i>y</i> = a + bcos( c<i>x</i> + d )";
    }
    
    /**
     *
     * @param x
     * @return
     */
    @Override
    public double getY( double x ) {
        return Params[0] + Params[1] * Math.cos( Params[2] * x + Params[3] );
    }
}
