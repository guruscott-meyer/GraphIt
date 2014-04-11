package graphit;

import GraphPanel.Formula;

public class PowerOfE extends Formula
   {
    
    public PowerOfE() {
        super();
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
