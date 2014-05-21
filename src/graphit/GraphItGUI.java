/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphit;

import GraphPanel.GraphPanel.*;
import GraphPanel.Function.*;
import java.awt.Color;
import javax.swing.JColorChooser;
import java.util.*;
import java.beans.*;

/**
 *
 * @author Scott Meyer
 */
public class GraphItGUI extends javax.swing.JFrame implements PropertyChangeListener {

    /**
     * Creates new form GraphItGUI
     */
    public GraphItGUI() {
        funcList = new ArrayList();
        scale = 10.0;
        defaultColor = Color.BLACK;
        initComponents();
        controlPanel.setLayout(new javax.swing.BoxLayout(controlPanel, javax.swing.BoxLayout.Y_AXIS));
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        mainGraphPanel = new GraphPanel.GraphPanel();
        controlScrollPane = new javax.swing.JScrollPane();
        controlPanel = new javax.swing.JPanel();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        viewMenu = new javax.swing.JMenu();
        colorMenuItem = new javax.swing.JMenuItem();
        zoomInMenuItem = new javax.swing.JMenuItem();
        zoomOutMenuItem = new javax.swing.JMenuItem();
        newFuncMenuItem = new javax.swing.JMenuItem();
        clearMenuItem = new javax.swing.JMenuItem();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout mainGraphPanelLayout = new javax.swing.GroupLayout(mainGraphPanel);
        mainGraphPanel.setLayout(mainGraphPanelLayout);
        mainGraphPanelLayout.setHorizontalGroup(
            mainGraphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 494, Short.MAX_VALUE)
        );
        mainGraphPanelLayout.setVerticalGroup(
            mainGraphPanelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 430, Short.MAX_VALUE)
        );

        controlPanel.setMaximumSize(new java.awt.Dimension(220, 32767));
        controlPanel.setMinimumSize(new java.awt.Dimension(220, 0));
        controlPanel.setLayout(null);
        controlScrollPane.setViewportView(controlPanel);

        jMenu1.setText("File");
        jMenuBar1.add(jMenu1);

        viewMenu.setText("View");

        colorMenuItem.setText("Color");
        colorMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                colorMenuItemActionPerformed(evt);
            }
        });
        viewMenu.add(colorMenuItem);

        zoomInMenuItem.setText("Zoom In");
        zoomInMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoomInMenuItemActionPerformed(evt);
            }
        });
        viewMenu.add(zoomInMenuItem);

        zoomOutMenuItem.setText("Zoom Out");
        zoomOutMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                zoomOutMenuItemActionPerformed(evt);
            }
        });
        viewMenu.add(zoomOutMenuItem);

        newFuncMenuItem.setText("New Function");
        newFuncMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                newFuncMenuItemActionPerformed(evt);
            }
        });
        viewMenu.add(newFuncMenuItem);

        clearMenuItem.setText("Clear");
        clearMenuItem.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                clearMenuItemActionPerformed(evt);
            }
        });
        viewMenu.add(clearMenuItem);

        jMenuBar1.add(viewMenu);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(controlScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(mainGraphPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(mainGraphPanel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(controlScrollPane)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void zoomInMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoomInMenuItemActionPerformed
        scale /= 2.0;
        mainGraphPanel.setScale( scale );
    }//GEN-LAST:event_zoomInMenuItemActionPerformed

    private void zoomOutMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_zoomOutMenuItemActionPerformed
        scale *= 2.0;
        mainGraphPanel.setScale( scale );
    }//GEN-LAST:event_zoomOutMenuItemActionPerformed

    private void colorMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_colorMenuItemActionPerformed
//        Color newColor = JColorChooser.showDialog( rootPane, "Function Color", form.getColor() );
//        if( newColor != null ) {
//            form.setColor( newColor );
//            defaultColor = newColor;
//        }
    }//GEN-LAST:event_colorMenuItemActionPerformed

    private void newFuncMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_newFuncMenuItemActionPerformed
        FuncChooser temp = new FuncChooser();
        temp.addPropertyChangeListener( this );
        controlPanel.add( temp );
        pack();
    }//GEN-LAST:event_newFuncMenuItemActionPerformed

    private void clearMenuItemActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_clearMenuItemActionPerformed
        mainGraphPanel.setGraphing( false );
        funcList = new ArrayList();
        controlPanel.removeAll();
        controlPanel.repaint();
    }//GEN-LAST:event_clearMenuItemActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(GraphItGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(GraphItGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(GraphItGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(GraphItGUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(() -> {
            new GraphItGUI().setVisible(true);
        });
    }
    
    @Override
    public void propertyChange( PropertyChangeEvent e ) {
        if( e.getOldValue() != null ) funcList.remove( e.getOldValue() );
        funcList.add( (GraphPanel.Function) e.getNewValue() );
        //System.out.println( funcList.size() );
        mainGraphPanel.setFunctionList( funcList );
        mainGraphPanel.setGraphing( true );
        //pack();
    }
    
    private ArrayList<GraphPanel.Function> funcList;
    private double scale;
    private Color defaultColor;
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem clearMenuItem;
    private javax.swing.JMenuItem colorMenuItem;
    private javax.swing.JPanel controlPanel;
    private javax.swing.JScrollPane controlScrollPane;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenuBar jMenuBar1;
    private GraphPanel.GraphPanel mainGraphPanel;
    private javax.swing.JMenuItem newFuncMenuItem;
    private javax.swing.JMenu viewMenu;
    private javax.swing.JMenuItem zoomInMenuItem;
    private javax.swing.JMenuItem zoomOutMenuItem;
    // End of variables declaration//GEN-END:variables
}
