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
public class OperacionesBásicas 
{
    public static void sumaDosNumeros()
    {
        int x=5;
        int y=3;
        
        JOptionPane.showMessageDialog(null,"La suma de 5 + 3 es " + (x+y));
    }
    
    public static void sumaParametros(int x, int y)
    {
        int z = x+y;
        JOptionPane.showMessageDialog(null, "La suma es " + z);
    }
    
    public static int sumaDevuelve(int x, int y)
    {
        JOptionPane.showMessageDialog(null, "La suma es " + (x+y));
        return(x+y);
    }
}
