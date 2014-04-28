package graphit;

import GraphPanel.Function;

public class LnX extends OneArgumentFunction
   {
   
    public LnX() {
        super( new Sum( new Product( new Parameter("a"), new Log( new X() )), new Parameter("b") ) );
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
