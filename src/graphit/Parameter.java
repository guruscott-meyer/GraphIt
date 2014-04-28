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
public class Parameter extends Function {
    
    private String sliderLabel;
    
    public Parameter() {
        super( new double[] { 0.0 } );
        sliderLabel = new String();
    }
    
    public Parameter( String newSliderLabel ) {
        super( new double[] { 0.0 } );
        sliderLabel = newSliderLabel;
    }
    
    public void setSliderLabel( String newSliderLabel ) {
        sliderLabel = newSliderLabel;
    }
    
    public String getSliderlabel() {
        return sliderLabel;
    }
    
    @Override
    public void setParam( int index, double newParam ) {
        double oldParam = Params[0];
        Params[0] = newParam;
        pcs.firePropertyChange( "Params", oldParam, newParam );
    }
    
    @Override
    public int getParamCount() {
        return 1;
    }
    
    @Override
    public String getLabel() {
        return sliderLabel;
    }
    
    @Override
    public double getY( double x ) {
        return Params[0];
    }
}
