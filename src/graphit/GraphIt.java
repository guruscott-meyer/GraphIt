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
public class GraphIt {

    public static GraphItGUI gui;
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        gui = new GraphItGUI();
        gui.setVisible( true );
    }
    
}
