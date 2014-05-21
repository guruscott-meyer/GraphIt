package graphit;

public class X2 extends OneArgumentFunction
   {

    public X2() {
        super( new Product( new Parameter("a"), new PowerOf( new X(), new Constant( 2.0 ) )));
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