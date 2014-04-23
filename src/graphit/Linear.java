package graphit;

import GraphPanel.Function;

public class Linear extends Function
   {

    public Linear() {
        super( new double[] { 0.0, 0.0 } );
        label = "<html><i>y</i> = a<i>x</i> + b</html>";
    }
    
    public Linear( double params[] ) {
        super( params );
        label = "<html><i>y</i> = a<i>x</i> + b</html>";
    }
    
   @Override
   public double getY( double x )
      {
      return Params[0] * x + Params[1];
      }

   }
