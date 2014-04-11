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
public class Sin extends Formula {
    
    public Sin() {
        super();
        label = "<html><i>y</i> = a + bsin( c<i>x</i> + d )";
    }
    
    public Sin( double Params[] ) {
        super( Params );
        label = "<html><i>y</i> = a + bsin( c<i>x</i> + d )";
    }
    
    /**
     *
     * @param x
     * @return
     */
    @Override
    public double getY( double x ) {
        return Params[0] + Params[1] * Math.sin( Params[2] * x + Params[3] );
    }
}
