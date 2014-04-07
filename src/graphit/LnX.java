package graphit;

public class LnX extends Formula
   {
   
    public LnX() {
        super();
    }
    
    public LnX( double params[] ) {
        super( params );
    }
    
   @Override
   public double getY( double x )
      {
      if( x == 0 ) x = 0.000000001;
      return Params[0] * Math.log( x ) + Params[1];
      }

   }
