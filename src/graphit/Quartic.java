package graphit;

import GraphPanel.Formula;

public class Quartic extends Formula
   {
    
    public Quartic() {
        super();
        label = "<html>a<i>x</i><sup>4</sup> + b<i>x</i><sup>3</sup> + c<i>x</i><sup>2</sup> + d<i>x</i> + e</html>";
    }
    
    public Quartic( double params[] ) {
        super( params );
        label = "<html>a<i>x</i><sup>4</sup> + b<i>x</i><sup>3</sup> + c<i>x</i><sup>2</sup> + d<i>x</i> + e</html>";
    }
   
    @Override
   public double getY( double x )
      {
      return Params[4] + Params[3] * x + Params[2] * x * x + Params[1] * x * x * x + Params[0] * x * x * x * x;
      }

   }
