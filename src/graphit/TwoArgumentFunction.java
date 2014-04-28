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
public abstract class TwoArgumentFunction extends Function {
    
    protected Function funcA, funcB;
    
    public TwoArgumentFunction() {
        super();
        funcA = new X();
        funcB = new X();
    }
    
    public TwoArgumentFunction( Function newFuncA, Function newFuncB ) {
        super();
        funcA = newFuncA;
        funcB = newFuncB;
    }
    
    @Override
    public void setParams( double[] params ) {
        double[] oldParams = getParams();
        if( funcA.getParamCount() > 0 )
            for( int i = 0; i < funcA.getParamCount(); i++ ) {
                funcA.setParam( i, params[i] );           
            }
        if( funcA.getParamCount() > 0 )
            for( int i = 0; i < funcB.getParamCount(); i++) {
                funcB.setParam( i, params[ funcA.getParamCount() + i ]);
            }
        pcs.firePropertyChange( "Params", oldParams, getParams() );
    }
    
    @Override
    public double[] getParams() {
        int lastIndex = 0;
        if( funcA.getParamCount() > 0 ) lastIndex += funcA.getParamCount();
        if( funcB.getParamCount() > 0 ) lastIndex += funcB.getParamCount();
        double[] temp = new double[ lastIndex ];
        if( funcA.getParamCount() > 0 )
            for( int i = 0; i < funcA.getParamCount(); i++ ) {
                temp[i] = funcA.getParam( i );                   
            }
        if( funcB.getParamCount() > 0 )
            for( int i = 0; i < funcB.getParamCount(); i++ ) {
                temp[i + funcA.getParamCount()] = funcB.getParam( i );
            }
        return temp;
    }
    
    @Override
    public void setParam( int index, double newParam ) {
        double oldParam = getParam( index );
        if( funcA.getParamCount() > index )
            funcA.setParam( index, newParam );
        else
            funcB.setParam(index - funcA.getParamCount(), newParam);
        pcs.firePropertyChange( "Params", oldParam, newParam );
    }
    
    @Override
    public double getParam( int index ) {
        if( index > funcA.getParamCount() + funcB.getParamCount() || index < 0 ) return 0.0;
        if( funcA.getParamCount() <= index )
            return funcA.getParam(index);
        else return funcB.getParam(index - funcA.getParamCount() );
    }
    
    @Override
    public int getParamCount() {
        return funcA.getParamCount() + funcB.getParamCount();
    }
    
}
