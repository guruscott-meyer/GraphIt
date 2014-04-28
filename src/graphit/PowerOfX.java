package graphit;

public class PowerOfX extends OneArgumentFunction
   {
    
    public PowerOfX() {
        super( new Product( new Parameter ("a"), new PowerOf( new X(), new Parameter("b"))));
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
