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
public abstract class OneArgumentFunction extends Function{
    
    protected Function func;
    
    public OneArgumentFunction() {
        super();
        func = new X();
    }
    
    public OneArgumentFunction( Function newFunc ) {
        super();
        func = newFunc;
    }
    
    @Override
    public void setParams( double[] newParams ) {
        double[] oldParams = func.getParams();
        func.setParams( newParams );
        pcs.firePropertyChange( "Params", oldParams, newParams );
    }
    
    @Override
    public double[] getParams() {
        return func.getParams();
    }
    
    @Override
    public void setParam( int index, double newParam ) {
        double oldParam = getParam(index);
        func.setParam( index, newParam );
        pcs.firePropertyChange("Params", oldParam, newParam);
    }
    
    @Override
    public double getParam( int  index ) {
        return func.getParam( index );
    }

    @Override
    public int getParamCount() {
        return func.getParamCount();
    }

    
}
