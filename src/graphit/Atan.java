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
public class Atan extends Function {
    
    public Atan() {
        super( new double[] { 0.0, 0.0, 0.0, 0.0 } );
        label = "<html><i>y</i> = a + bArctan( c<i>x</i> + d )</html>";
    }
    
    public Atan( double Params[] ) {
        super( Params );
        label = "<html><i>y</i> = a + bArctan( c<i>x</i> + d )</html>";
    }
    
    @Override
    public double getY( double x ) {
        return Params[0] + Params[1] * Math.atan(Params[2] * x + Params[3]);
    }
    
}
