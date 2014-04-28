package graphit;

public class PowerOfE extends OneArgumentFunction
   {
    
    public PowerOfE() {
        super( new Product( new Parameter("a"), new Exp( new Product( new Parameter("b"), new X() ))));
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
