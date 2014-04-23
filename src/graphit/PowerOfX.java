package graphit;

import GraphPanel.Function;

public class PowerOfX extends Function
   {
    
    public PowerOfX() {
        super( new double[] { 0.0, 0.0 } );
        label = "<html><i>y</i> = b<i>x</i><sup>a</sup></html>";
    }
    
    public PowerOfX( double params[] ) {
        super( params );
        label = "<html><i>y</i> = b<i>x</i><sup>a</sup></html>";
    }
   
   @Override
   public double getY( double x )
      {
      return Params[1] * Math.pow( x, Params[0] );
      }

   }
