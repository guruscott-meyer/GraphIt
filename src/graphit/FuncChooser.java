/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphit;

import GraphPanel.*;
import java.awt.Color;
import java.beans.*;
import java.util.ArrayList;
import javax.swing.*;
import java.lang.Math;

/**
 *
 * @author admin
 */
public class FuncChooser extends javax.swing.JPanel {

    /**
     * Creates new form FuncChooser
     */
    public FuncChooser( GraphPanel newGraphPanel) {
        initComponents();
        //setLayout(new BoxLayout( this, BoxLayout.Y_AXIS ));
        mainGraphPanel = newGraphPanel;
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

        functionBox.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Function Builder", "Line", "Quadratic", "Cubic", "Quartic", "lnX", "Power of E", "Power of X", "X Squared", "X Cubed", "Sine", "Cosine", "Tangent", "Secant", "Cosecant", "Cotangent", "Arcsine", "Arccosine", "Arctangent", "Arcsecant", "Arccosecant", "Arccotangent" }));
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

        sliderPanel.setLayout(new javax.swing.BoxLayout(sliderPanel, javax.swing.BoxLayout.Y_AXIS));

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
        FunctionFramework oldFunc = function;
        sliderPanel.removeAll();
        ArrayList<Parameter> parameters = new ArrayList();
        switch( functionBox.getSelectedIndex() ) {
            case 0: function = new FunctionFramework( (a,b) -> 0.0, (a,b) -> "0.0" );
                    ArrayList<FunctionFramework> functions = new ArrayList();
                    FunctionBuilderDialog builder = new FunctionBuilderDialog( new JFrame(), true, parameters, functions );
                    builder.setVisible( true );
                    function = functions.get(0);
                    for( int i = 0; i < parameters.size(); i++ ) {
                        parameters.get( i ).addPropertyChangeListener(mainGraphPanel);
                        ParamSlider newParamSlider = new ParamSlider( parameters.get( i ) );
                        String newLabel = new String( Character.toChars( Character.codePointAt( new char[] { 'a' }, 0 ) + i) );
                        newParamSlider.setLabel( newLabel );
                        sliderPanel.add( newParamSlider );
                        }
                    break;
            case 1: setupParameters( parameters, 2 );
                    function = FunctionFactory.Linear( parameters );
                    break;
            case 2: setupParameters( parameters, 3 );
                    function = FunctionFactory.Quadratic( parameters );
                    break;
            case 3: setupParameters( parameters, 4 );
                    function = FunctionFactory.Cubic( parameters );
                    break;
            case 4: setupParameters( parameters, 5 );
                    function = FunctionFactory.Quartic( parameters );
                    break;
            case 5: setupParameters( parameters, 2 );
                    function = FunctionFactory.LnX( parameters );
                    break;
            case 6: setupParameters( parameters, 2 );
                    function = FunctionFactory.PowerofE( parameters );
                    break;
            case 7: setupParameters( parameters, 2 );
                    function = FunctionFactory.PowerofX( parameters );
                    break;
            case 8: setupParameters( parameters, 1 );
                    function = FunctionFactory.X2( parameters );
                    break;
            case 9: setupParameters( parameters, 1 );
                    function = FunctionFactory.X3( parameters );
                break;
            case 10: setupParameters( parameters, 4 );
                    function = FunctionFactory.Sine( parameters );
                    break;
            case 11: setupParameters( parameters, 4 );
                    function = FunctionFactory.Cosine( parameters );
                    break;
            case 12: setupParameters( parameters, 4 );
                    function = FunctionFactory.Tangeant( parameters );
                    break;
            case 13: setupParameters( parameters, 4 );
                    function = FunctionFactory.Secant( parameters );
                    break;
            case 14: setupParameters( parameters, 4 );
                    function = FunctionFactory.Cosecant( parameters );
                    break;
            case 15: setupParameters( parameters, 4 );
                    function = FunctionFactory.Cotangeant( parameters );
                    break;
            case 16: setupParameters( parameters, 4 );
                    function = FunctionFactory.Arcsine( parameters );
                    break;
            case 17: setupParameters( parameters, 4 );
                    function = FunctionFactory.Arccosine( parameters );
                    break;
            case 18: setupParameters( parameters, 4 );
                    function = FunctionFactory.Arctangeant( parameters );
                    break;
            case 19: setupParameters( parameters, 4 );
                    function = FunctionFactory.Arcsecant( parameters );
                    break;
            case 20: setupParameters( parameters, 4 );
                    function = FunctionFactory.Arccosecant( parameters );
                    break;
            case 21: setupParameters( parameters, 4 );
                    function = FunctionFactory.Arccotangeant( parameters );
                    break;
//            case 22: function = new FunctionFramework( (a,b) -> 0, (a,b) -> "0" );
//                    FunctionBuilderDialog builder = new FunctionBuilderDialog( new JFrame(), false, parameters, function );
//                    builder.setVisible( true );
        }
        functionLabel.setText( String.format("<html><i>y</i> = %s</html>", function.getLabelText() ) );
        
        Color newColor = JColorChooser.showDialog( this, "Function Color", function.getColor() );
        if( newColor != null ) {
            function.setColor( newColor );
        }
        support.firePropertyChange( "function", oldFunc, function );
    }//GEN-LAST:event_functionBoxActionPerformed

    public void setFunction( FunctionFramework newFunc  )  {
        function = newFunc;
    }
    
    public FunctionFramework getFunction() {
        return function;
    }
    
    private void setupParameters( ArrayList parameters, int numParameters ) {
        for( int i = 0; i < numParameters; i++ ) {
            Parameter newParam = new Parameter();
            newParam.addPropertyChangeListener(mainGraphPanel);
            parameters.add( newParam );
            ParamSlider newParamSlider = new ParamSlider( newParam );
            String newLabel = new String( Character.toChars( Character.codePointAt( new char[] { 'a' }, 0 ) + i) );
            newParamSlider.setLabel( newLabel );
            sliderPanel.add( newParamSlider );
        }
    }
    
    private FunctionFramework function;
    private GraphPanel mainGraphPanel;
    private PropertyChangeSupport support = new PropertyChangeSupport( this );
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox functionBox;
    private javax.swing.JLabel functionLabel;
    private javax.swing.JPanel sliderPanel;
    // End of variables declaration//GEN-END:variables
}
