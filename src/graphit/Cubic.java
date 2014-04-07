package graphit;

public class Cubic extends Formula
   {
    
    public Cubic() {
        super();
    }

   public Cubic( double[] params )
      {
      super( params );
      }

    @Override
   public double getY( double x )
      {
      return Params[0] + Params[1] * x + Params[2] * x * x + Params[3] * x * x * x;
      }

   }


