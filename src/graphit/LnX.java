package graphit;

import GraphPanel.Function;

public class LnX extends Function
   {
   
    public LnX() {
        super( new double[] { 0.0, 0.0 } );
        label = "<html><i>y</i> = aln<i>x</i> + b</html>";
    }
    
    public LnX( double params[] ) {
        super( params );
        label = "<html><i>y</i> = aln<i>x</i> + b</html>";
    }
    
   @Override
   public double getY( double x )
      {
      if( x == 0 ) x = 0.000000001;
      return Params[0] * Math.log( x ) + Params[1];
      }

   }
