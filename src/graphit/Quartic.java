package graphit;

public class Quartic extends OneArgumentFunction
   {
    
    public Quartic() {
        super( new Sum( new Product( new Parameter("e"), new PowerOf( new X(), new Constant(4.0) )), new Cubic() ) );
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
