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
public class X extends Function {
    
    public X() {
        super();
    }
    
    @Override
    public String getLabel() {
        return "<i>x</i>";
    }
    
    @Override
   public double getY( double x )
      {
      return x;
      }
   
   @Override
   public int getParamCount() {
       return 0;
   }
    
}
