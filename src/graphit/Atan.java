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
public class Atan extends Formula {
    
    public Atan() {
        super();
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
