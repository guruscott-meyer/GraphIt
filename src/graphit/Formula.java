package graphit;

import java.awt.Color;

public abstract class Formula extends Object
   {

   protected double[] Params;
   private Color color;
   protected String label;

   public Formula()
      {
      label = new String();
      color = Color.black;
      }

   public Formula( double[] params )
      {
      Params = params;
      label = new String();
      color = Color.black;
      }

   public void setColor( Color newColor ) {
       color = newColor;
   }
   
   public Color getColor() {
       return color;
   }
   
   public void setParams( double[] params ) {
       Params = params;
   }
   
   public double[] getParams()
      {
      return Params;
      }
   
   public void setA( double newParam ) {
       Params[0] = newParam;
   }
   
   public void setB( double newParam ) {
       Params[1] = newParam;
   }
   
   public void setC( double newParam ) {
       Params[2] = newParam;
   }
   
   public void setD( double newParam ) {
       Params[3] = newParam;
   }
   
   public void setE( double newParam ) {
       Params[4] = newParam;
   }
   
   public double getA() {
       return Params[0];
   }
   
   public double getB() {
       return Params[1];
   }
   
   public double getC() {
       return Params[2];
   }
   
   public double getD() {
       return Params[3];
   }
   
   public double getE() {
       return Params[4];
   }
   
   public String getLabel() {
       return label;
   }

   public abstract double getY( double x );

}