package graphit;

import GraphPanel.Formula;

public class X3 extends Formula
   {
    
    public X3() {
        super();
        label = "<html><i>y</i> = a<i>x</i><sup>3</sup></html>";
    }
    
    public X3( double params[]) {
        super( params );
        label = "<html><i>y</i> = a<i>x</i><sup>3</sup></html>";
    }
    
    @Override
   public double getY( double x )
      {
      return Params[0] * Math.pow( x, 3.0 );
      }

   }
