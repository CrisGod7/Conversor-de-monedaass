package com.mycompany.conversordemoneda;

import javax.swing.JOptionPane;

public class ConversorDeMoneda {

    public static void main(String[] args) {
        Operaciones operaciones = new Operaciones();
        boolean e = true;

        do {
            Object optionObject = JOptionPane.showInputDialog(null, "Seleccione una opcion", "Entrada de datos", JOptionPane.QUESTION_MESSAGE,
                    null, new Object[]{"Convertidor de Monedas", "Convertir unidades ","Salir"}, "Convertidor de Monedas");
            if (optionObject.equals("Convertidor de Monedas")) {
                operaciones.menuMonedas();
            } else {
                if (optionObject.equals("Convertir unidades ")) {
                    operaciones.menuUnidades();
                }else{
                 e = false;
                }
            } 
               
            
        } while (e == true);

    }
}
