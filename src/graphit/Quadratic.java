package graphit;

import GraphPanel.Function;

public class Quadratic extends Function
   {
    
    public Quadratic() {
        super( new double[] { 0.0, 0.0, 0.0 } );
        label = "<html>a<i>x</i><sup>2</sup> + b<i>x</i> + c</html>";
    }

    public Quadratic( double params[] ) {
        super( params );
        label = "<html>a<i>x</i><sup>2</sup> + b<i>x</i> + c</html>";
    }
    
    /**
     *
     * @param x
     * @return
     */
    @Override
   public double getY( double x )
      {
      return Params[2] + Params[1] * x + Params[0] * x * x;
      }


   }


