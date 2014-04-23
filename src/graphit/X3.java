package graphit;

import GraphPanel.Function;

public class X3 extends Function
   {
    
    public X3() {
        super( new double[] { 0.0 } );
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
