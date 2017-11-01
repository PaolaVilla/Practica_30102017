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
public class Deber 
{
    public static void menu()
    {
        int op = 0;
        
        do
        {
            op = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese una opción"
            + "\n 1. Suma de dos numeros" 
            + "\n 2. Suma con Parámetros"
            + "\n 3. Suma devuelve"
            + "\n 4. If anidado"
            + "\n 5. Salir"));
            
            switch(op)
            {
                case 1:
                    OperacionesBásicas.sumaDosNumeros();
                    break;
                    
                case 2:
                    int a = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer número"));
                    int b = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer número"));
                    OperacionesBásicas.sumaParametros(a, b);
                    break;
                    
                case 3:
                    int x = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer número"));
                    int y = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el primer número"));
                    OperacionesBásicas.sumaDevuelve(x, y);
                    break;
                    
                case 4:
                    ControlFlujo.ifAnidado();
                    break;
                    
                case 5:
                    JOptionPane.showMessageDialog(null, "Gracias por utilizar el sistema");
                    break;
            }
        }
        
        while (op!=0);
  
    }
}
