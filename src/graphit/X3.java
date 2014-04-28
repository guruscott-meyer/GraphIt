package graphit;

import GraphPanel.Function;

public class X3 extends OneArgumentFunction
   {
    
    public X3() {
        super( new Product( new Parameter("A"), new PowerOf( new X(), new Constant( 3.0 ) )));
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
