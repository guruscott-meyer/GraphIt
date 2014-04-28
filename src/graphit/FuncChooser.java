/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphit;

import GraphPanel.Function.*;
import java.awt.Color;
import java.beans.*;
import java.util.ArrayList;
import javax.swing.*;

/**
 *
 * @author admin
 */
public class FuncChooser extends javax.swing.JPanel {

    /**
     * Creates new form FuncChooser
     */
    public FuncChooser() {
        initComponents();
        //setLayout(new BoxLayout( this, BoxLayout.Y_AXIS ));
        sliderPanel.setLayout(new BoxLayout( sliderPanel, BoxLayout.Y_AXIS ));
    }
    
    @Override
    public void addPropertyChangeListener( PropertyChangeListener listener ) {
        support.addPropertyChangeListener( listener );
    }
    
    @Override
    public void removePropertyChangeListener( PropertyChangeListener listener ) {
        support.removePropertyChangeListener( listener );
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        functionBox = new javax.swing.JComboBox();
        functionLabel = new javax.swing.JLabel();
        sliderPanel = new javax.swing.JPanel();

        functionBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Constant", "Line", "Quadratic", "Cubic", "Quartic", "lnX", "Power of E", "Power of X", "X Squared", "X Cubed", "Sine", "Cosine", "Tangent", "Secant", "Cosecant", "Cotangent", "Arcsine", "Arccosine", "Arctangent", "Arcsecant", "Arccosecant", "Arccotangent" }));
        functionBox.setSelectedIndex(-1);
        functionBox.setMaximumSize(new java.awt.Dimension(200, 22));
        functionBox.setMinimumSize(new java.awt.Dimension(200, 22));
        functionBox.setPreferredSize(new java.awt.Dimension(200, 22));
        functionBox.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                functionBoxActionPerformed(evt);
            }
        });

        functionLabel.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        functionLabel.setText(" ");
        functionLabel.setMaximumSize(new java.awt.Dimension(100, 22));
        functionLabel.setMinimumSize(new java.awt.Dimension(100, 22));
        functionLabel.setPreferredSize(new java.awt.Dimension(100, 22));

        javax.swing.GroupLayout sliderPanelLayout = new javax.swing.GroupLayout(sliderPanel);
        sliderPanel.setLayout(sliderPanelLayout);
        sliderPanelLayout.setHorizontalGroup(
            sliderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 200, Short.MAX_VALUE)
        );
        sliderPanelLayout.setVerticalGroup(
            sliderPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 70, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(functionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(functionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, 200, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(sliderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(functionBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(6, 6, 6)
                .addComponent(functionLabel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(sliderPanel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void functionBoxActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_functionBoxActionPerformed
        GraphPanel.Function oldFunc = function;
        sliderPanel.removeAll();
        switch( functionBox.getSelectedIndex() ) {
            case 0: function = new Constant();
                break;
            case 1: function = new Linear();
                break;
            case 2: function = new Quadratic();
                break;
            case 3: function = new Cubic();
                break;
            case 4: function = new Quartic();
                break;
            case 5: function = new LnX();
                break;
            case 6: function = new PowerOfE();
                break;
            case 7: function = new PowerOfX();
                break;
            case 8: function = new X2();
                break;
            case 9: function = new X3();
                break;
            case 10: function = new Sin();
                break;
            case 11: function = new Cos();
                break;
            case 12: function = new Tan();
                break;
            case 13: function = new Sec();
                break;
            case 14: function = new Csc();
                break;
            case 15: function = new Cot();
                break;
            case 16: function = new Asin();
                break;
            case 17: function = new Acos();
                break;
            case 18: function = new Atan();
                break;
            case 19: function = new Asec();
                break;
            case 20: function = new Acsc();
                break;
            case 21: function = new Acot();
        }
        functionLabel.setText( "<html><i>y</i> = " + function.getLabel() + "</html>");
        if(function.getParams() != null )
            for( int i = 0; i < function.getParamCount(); i++ ) {
                ParamSlider newParamSlider = new ParamSlider( function, i );
                String newLabel = new String( Character.toChars( Character.codePointAt( new char[] { 'a' }, 0 ) + i) );
                //String newLabel = new String( Integer.toString(Character.codePointAt( new char[] { 'a' }, 0 ) + i) );
                //System.out.println( newLabel );
                newParamSlider.setLabel( newLabel );
                sliderPanel.add( newParamSlider );
            }
        Color newColor = JColorChooser.showDialog( this, "Function Color", function.getColor() );
        if( newColor != null ) {
            function.setColor( newColor );
        }
        support.firePropertyChange( "function", oldFunc, function );
    }//GEN-LAST:event_functionBoxActionPerformed

    public void setFunction( GraphPanel.Function newFunc  )  {
        function = newFunc;
    }
    
    public GraphPanel.Function getFunction() {
        return function;
    }
    
    private GraphPanel.Function function;
    private PropertyChangeSupport support = new PropertyChangeSupport( this );
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox functionBox;
    private javax.swing.JLabel functionLabel;
    private javax.swing.JPanel sliderPanel;
    // End of variables declaration//GEN-END:variables
}
