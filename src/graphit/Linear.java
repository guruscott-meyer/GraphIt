
package graphit;

public class Linear extends OneArgumentFunction
   {

    public Linear() {
        super( new Sum( new Parameter("a"), new Product( new Parameter("b"), new X() ) ) );
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