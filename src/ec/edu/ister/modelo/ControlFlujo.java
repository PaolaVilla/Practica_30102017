/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.modelo;

import javax.swing.JOptionPane;

/**
 * @Instituto Rumiñahui
 * @author Paola
 */
public class ControlFlujo 
{
    public static void ifAnidado()
    {
        int a=3;
        
        if (a>3)
        {
            JOptionPane.showMessageDialog(null, "El numero es mayor");
            //System.out.println("es mayor");
        }
        else if (a<3)
        {
            JOptionPane.showMessageDialog(null, "El numero es menor");
            //System.out.println("es menor");
        }
        else
        {
            JOptionPane.showMessageDialog(null, "El numero es igual");
            //System.out.println("es igual");
        }
    }
    
}
