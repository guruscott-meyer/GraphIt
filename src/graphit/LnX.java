package graphit;

import GraphPanel.Formula;

public class LnX extends Formula
   {
   
    public LnX() {
        super();
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
