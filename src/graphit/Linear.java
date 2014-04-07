package graphit;

public class Linear extends Formula
   {

    public Linear() {
        super();
    }
    
    public Linear( double params[] ) {
        super( params );
    }
    
   @Override
   public double getY( double x )
      {
      return Params[0] * x + Params[1];
      }

   }
