package graphit;

public class Cubic extends OneArgumentFunction
   {
    
    public Cubic() {
        super( new Sum( new Quadratic(), new Product( new Parameter("d"), new PowerOf( new X(), new Constant(3.0) )) ) );
    }

    @Override
    public String getLabel() {
        return func.getLabel();
    }
    
    @Override
   public double getY( double x )
      {
      return func.getY( x );
      }

   }