package graphit;

public class Linear extends OneArgumentFunction
   {

    public Linear() {
        super( new Sum( new Product( new Parameter("b"), new X() ), new Parameter("a") ) );
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
