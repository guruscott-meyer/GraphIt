package graphit;

public class Quadratic extends Formula
   {
    
    public Quadratic() {
        super();
    }

    public Quadratic( double params[] ) {
        super( params );
    }
    
    /**
     *
     * @param x
     * @return
     */
    @Override
   public double getY( double x )
      {
      return Params[0] + Params[1] * x + Params[2] * x * x;
      }


   }


