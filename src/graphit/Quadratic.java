package graphit;

public class Quadratic extends OneArgumentFunction
   {
    
    public Quadratic() {
        super( new Sum(  new Linear(), new Product( new Parameter("c"), new PowerOf( new X(), new Constant(2.0) )) ) );
    }
    
    @Override
    public String getLabel() {
        return func.getLabel();
    }
    
    /**
     *
     * @param x
     * @return
     */
    @Override
   public double getY( double x )
      {
      return func.getY( x );
      }


   }
