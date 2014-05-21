/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphit;

/**
 *
 * @author admin
 */
public class AcscX extends OneArgumentFunction{
    
    public AcscX() {
        super( new Sum( new Parameter("a"), new Product( new Parameter("b"), new Acsc( new Sum( new Product( new Parameter("c"), new X() ), new Parameter("d"))))));
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
