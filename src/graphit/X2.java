package graphit;

public class X2 extends Formula
   {

    public X2() {
        super();
    }
    
    public X2( double params[]) {
        super( params );
    }
    
    @Override
   public double getY( double x )
      {
      return Params[0] * Math.pow( x, 2.0 );
      }

   }
