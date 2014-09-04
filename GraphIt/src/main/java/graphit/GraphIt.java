/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package graphit;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

/**
 *
 * @author Scott Meyer
 */
@Component
public class GraphIt {

    @Autowired
    public static GraphItGUI gui;
   
    /**
     * @param args the command line arguments
     */
    
    public static void main(String[] args) {
        
        ApplicationContext context = new ClassPathXmlApplicationContext( "application-context.xml");
        gui = (GraphItGUI) context.getBean("graphItGUI");

        gui.setVisible( true );
    }
    
}
