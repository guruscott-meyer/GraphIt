package graphit;

import GraphPanel.Formula;

public class X2 extends Formula
   {

    public X2() {
        super();
        label = "<html><i>y</i> = a<i>x</i><sup>2</sup></html>";
    }
    
    public X2( double params[]) {
        super( params );
        label = "<html><i>y</i> = a<i>x</i><sup>2</sup></html>";
    }
    
    @Override
   public double getY( double x )
      {
      return Params[0] * Math.pow( x, 2.0 );
      }

   }
