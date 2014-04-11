/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphit;

import GraphPanel.Formula;

/**
 *
 * @author Scott Meyer
 */
public class Const extends Formula {
    
    public Const() {
        super();
        label = "<html><i>y</i> = a<html>";
    }
    
    public Const( double params[] ) {
        super( params );
        label = "<html><i>y</i> = a<html>";
    }
    
    @Override
    public double getY( double x ) {
        return Params[0];
    }
    
}
