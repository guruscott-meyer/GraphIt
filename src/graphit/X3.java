package graphit;

public class X3 extends Formula
   {
    
    public X3() {
        super();
    }
    
    public X3( double params[]) {
        super( params );
    }
    
    @Override
   public double getY( double x )
      {
      return Params[0] * Math.pow( x, 3.0 );
      }

   }
