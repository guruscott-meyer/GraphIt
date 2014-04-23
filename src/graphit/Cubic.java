package graphit;

import GraphPanel.Function;

public class Cubic extends Function
   {
    
    public Cubic() {
        super( new double[] { 0.0, 0.0, 0.0, 0.0 } );
        label = "<html>a<i>x</i><sup>3</sup> + b<i>x</i><sup>2</sup> + c<i>x</i> + d</html>";
    }

   public Cubic( double[] params )
      {
      super( params );
      label = "<html>a<i>x</i><sup>3</sup> + b<i>x</i><sup>2</sup> + c<i>x</i> + d</html>";
      }

    @Override
   public double getY( double x )
      {
      return Params[3] + Params[2] * x + Params[1] * x * x + Params[0] * x * x * x;
      }

   }


