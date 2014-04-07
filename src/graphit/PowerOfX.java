package graphit;

public class PowerOfX extends Formula
   {
    
    public PowerOfX() {
        super();
    }
    
    public PowerOfX( double params[] ) {
        super( params );
    }
   
   @Override
   public double getY( double x )
      {
      return Params[1] * Math.pow( x, Params[0] );
      }

   }
