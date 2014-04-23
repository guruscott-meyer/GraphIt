package graphit;

import GraphPanel.Function;

public class PowerOfE extends Function
   {
    
    public PowerOfE() {
        super( new double[] { 0.0, 0.0 } );
        label = "<html><i>y</i> = be<sup>a<i>x</i></sup></html>";
    }
    
    public PowerOfE( double params[] ) {
        super( params );
        label = "<html><i>y</i> = be<sup>a<i>x</i></sup></html>";
    }

   @Override
   public double getY( double x )
      {
      return Params[1] * Math.exp( Params[0] * x );
      }

   }
