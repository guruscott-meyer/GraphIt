/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphpanel;

/**
 *
 * @author admin
 */
public class OneArgumentFunctionFramework extends FunctionFramework {
    
    public OneArgumentFunctionFramework( Function newfunc, LabelFunction newlabel ) {
        super( newfunc, newlabel );
    }
    
    public OneArgumentFunctionFramework( Function newfunc, LabelFunction newlabel, FunctionFramework newframe ) {
        super( newfunc, newlabel );
        framework1 = newframe;
    }
    
    public void setFramework( FunctionFramework newframe ) {
        framework1 = newframe;
    }
    
    @Override
    public double getY( double x ) {
        return function.getY( framework1.getY( x ), 0 );
    }
    
    @Override
    public String getLabelText() {
        return label.getLabel( framework1.getLabelText(), "" );
    }
    
}
