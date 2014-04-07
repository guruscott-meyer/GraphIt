package graphit;

public class Quartic extends Formula
   {
    
    public Quartic() {
        super();
    }
    
    public Quartic( double params[] ) {
        super( params );
    }
   
    @Override
   public double getY( double x )
      {
      return Params[0] + Params[1] * x + Params[2] * x * x + Params[3] * x * x * x + Params[4] * x * x * x * x;
      }

   }
