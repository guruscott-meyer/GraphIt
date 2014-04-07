package graphit;

public class PowerOfE extends Formula
   {
    
    public PowerOfE() {
        super();
    }
    
    public PowerOfE( double params[] ) {
        super( params );
    }

   @Override
   public double getY( double x )
      {
      return Params[1] * Math.exp( Params[0] * x );
      }

   }
