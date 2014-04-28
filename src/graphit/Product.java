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
public class Product extends TwoArgumentFunction {
    
    public Product() {
        super();
    }
    
    public Product( Function newFuncA, Function newFuncB) {
        super( newFuncA, newFuncB );
    }
    
    public String getLabel() {
        return funcA.getLabel() + funcB.getLabel();
    }
    
    public double getY( double x ) {
        return funcA.getY( x ) * funcB.getY ( x );
    }
}
