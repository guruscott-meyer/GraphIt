package graphit;

import GraphPanel.Formula;

public class PowerOfX extends Formula
   {
    
    public PowerOfX() {
        super();
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
