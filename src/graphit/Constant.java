/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphit;

import GraphPanel.Function;

/**
 *
 * @author Scott Meyer
 */
public class Constant extends Function {
    
    private double value;
    
    public Constant() {
        super();
        value = 0.0;
    }
    
    public Constant( double newValue ) {
        super();
        value = newValue;
    }
    
    public String getLabel() {
        if( value % 1.0 == 0 ) return String.valueOf( new Double(value).intValue() );
        else return String.valueOf(value);
    }
    
    @Override
    public double getY( double x ) {
        return value;
    }
    
    @Override
    public int getParamCount() {
        return 0;
    }
    
}
