package graphit;

import GraphPanel.Formula;

public class Linear extends Formula
   {

    public Linear() {
        super();
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
