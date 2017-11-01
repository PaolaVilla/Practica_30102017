/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package ec.edu.ister.vista;

import ec.edu.ister.modelo.ControlFlujo;
import ec.edu.ister.modelo.Deber;
import ec.edu.ister.modelo.OperacionesBásicas;
import javax.swing.JOptionPane;

/**
 * @Instituto Rumiñahui
 * @author Paola
 */
public class Aplicacion 
{
    public static void main(String[] args) 
    {
        /*OperacionesBásicas.sumaDosNumeros();
        
        int m = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
        int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese un numero"));
        OperacionesBásicas.sumaParametros(m,n);
        
        //JOptionPane.showMessageDialog(null,OperacionesBásicas.sumaDevuelve(6,7));
        int x = OperacionesBásicas.sumaDevuelve(6,7);
        JOptionPane.showMessageDialog(null,"La suma es " + x);
        
        ControlFlujo.ifAnidado();*/
        
        Deber.menu();
    }
}
