package com.mycompany.conversordemoneda;

import java.text.DecimalFormat;
import javax.swing.JOptionPane;

public class Operaciones {

    /* - Convertir de la moneda de tu país a Dólar
      - Convertir de la moneda de tu país  a Euros
      - Convertir de la moneda de tu país  a Libras Esterlinas
      - Convertir de la moneda de tu país  a Yen Japonés
      - Convertir de la moneda de tu país  a Won sul-coreano*/
    double dolar = 17,
            euro = 18.44,
            libraEsterlina = 21.6,
            yen = 0.12,
            won = 0.013;

    public String convertirPeso(double pesosMx) {

        String Message = "";

        DecimalFormat df = new DecimalFormat("#.00");

        Object v = JOptionPane.showInputDialog(null, "De Pesos MX a: ", "Monedas", JOptionPane.QUESTION_MESSAGE,
                null, new Object[]{"Dolar", "Euro", "Libra Esterlina", "Yen Japonés", "Won sul-coreano"}, "Dolar");

        if (v.equals("Dolar")) {

            JOptionPane.showMessageDialog(null, "Dolares: " + df.format(pesosMx / dolar));

        }
        if (v.equals("Euro")) {

            JOptionPane.showMessageDialog(null, "Euros: " + df.format(pesosMx / euro));
        }
        if (v.equals("Libra Esterlina")) {

            JOptionPane.showMessageDialog(null, "Libra Esterlina: " + df.format(pesosMx / libraEsterlina));

        }
        if (v.equals("Yen Japonés")) {
            JOptionPane.showMessageDialog(null, "Yenes: " + df.format(pesosMx / yen));

        }
        if (v.equals("Won sul-coreano")) {
            JOptionPane.showMessageDialog(null, "Wones:" + df.format(pesosMx / won));

        }

        return Message;
    }

    public String MonedaAPesosMX() {
        String Message = "";
        DecimalFormat df = new DecimalFormat("#.00");
        Object v = JOptionPane.showInputDialog(null, "Seleccione la moneda a convertir", "Entrada de datos", JOptionPane.QUESTION_MESSAGE,
                null, new Object[]{"Dolar", "Euro", "Libra Esterlina", "Yen Japonés", "Won sul-coreano"}, "Dolar");
        if (v.equals("Dolar")) {

            JOptionPane.showMessageDialog(null, "Pesos MX: " + df.format(verificarNum() * dolar));

        }
        if (v.equals("Euro")) {

            JOptionPane.showMessageDialog(null, "Pesos MX: " + df.format(verificarNum() * euro));
        }
        if (v.equals("Libra Esterlina")) {

            JOptionPane.showMessageDialog(null, "Pesos MX:" + df.format(verificarNum() * libraEsterlina));

        }
        if (v.equals("Yen Japonés")) {
            JOptionPane.showMessageDialog(null, "Pesos MX:" + df.format(verificarNum() * yen));

        }
        if (v.equals("Won sul-coreano")) {
            JOptionPane.showMessageDialog(null, "Pesos MX:" + df.format(verificarNum() * won));

        }

        return Message;
    }

    public void menuUnidades() {
        DecimalFormat df = new DecimalFormat("#.0000");
        int q ;
do {
        Object menu = JOptionPane.showInputDialog(null, "Seleccione la categoria", "-Menu conversor de unidades-", JOptionPane.QUESTION_MESSAGE,
                null, new Object[]{"Area", "Distancia", "Masa", "Tiempo"}, "Area");
        String option = menu.toString();
        
            switch (option) {
                case "Area":
                    Object area = JOptionPane.showInputDialog(null, "Seleccione una opcion", "Entrada de datos", JOptionPane.QUESTION_MESSAGE,
                            null, new Object[]{"CM2 a M2", "M2 a CM2"}, "CM a M");
                    if (area.equals("CM2 a M2")) {
                        double cm = verificarNum();
                        double m = cm / 10000;
                        JOptionPane.showMessageDialog(null, df.format(m) + " m2");

                    } else {
                        double m = verificarNum();
                        double cm = m * 10000;
                        JOptionPane.showMessageDialog(null, df.format(cm) + "cm2");

                    }
                    break;

                case "Distancia":
                    Object distancia = JOptionPane.showInputDialog(null, "Seleccione una opcion", "Entrada de datos", JOptionPane.QUESTION_MESSAGE,
                            null, new Object[]{"CM a M", "M a CM"}, "CM a M");
                    if (distancia.equals("CM a M")) {
                        double cm = verificarNum();
                        double m = cm / 100;
                        JOptionPane.showMessageDialog(null, df.format(m) + " m");

                    } else {
                        double m = verificarNum();
                        double cm = m * 100;
                        JOptionPane.showMessageDialog(null, df.format(cm) + "cm");

                    }

                    break;

                case "Masa":
                    Object masa = JOptionPane.showInputDialog(null, "Seleccione una opcion", "Entrada de datos", JOptionPane.QUESTION_MESSAGE,
                            null, new Object[]{"gr a Kg", "Kg a gr"}, "gr a Kg");
                    if (masa.equals("gr a Kg")) {
                        double gr = verificarNum();
                        double kg = gr / 1000;
                        JOptionPane.showMessageDialog(null, df.format(kg) + " Kg");

                    } else {
                        double Kg = verificarNum();
                        double gr = Kg * 1000;
                        JOptionPane.showMessageDialog(null, df.format(gr) + "gr");

                    }
                    break;

                case "Tiempo":

                    Object Time = JOptionPane.showInputDialog(null, "Seleccione una opcion", "Entrada de datos", JOptionPane.QUESTION_MESSAGE,
                            null, new Object[]{"Minutos a Horas", "Horas a Minutos"}, "Minutos a Horas");
                    if (Time.equals("Minutos a Horas")) {
                        double m = verificarNum();
                        double h = m / 60;
                        JOptionPane.showMessageDialog(null, df.format(h) + " horas");

                    } else {
                        double h = verificarNum();
                        double m = h * 60;
                        JOptionPane.showMessageDialog(null, df.format(m) + " minutos");

                    }
                    break;
            }//Swich

            Object yes_no = JOptionPane.showInputDialog(null, "¿Desea realizar mas conversiones?", "Message", JOptionPane.QUESTION_MESSAGE,
                    null, new Object[]{"Sí", "No"}, "gr a Kg");
            if (yes_no.equals("Sí")) {
                q = 0;
            } else {
                q = 1;
            }

        } while (q == 0);

    }

    public void menuMonedas() {
        int pesosMX = 0, moneda = 0;
        Object menu = JOptionPane.showInputDialog(null, "Seleccione la categoria", "Entrada de datos", JOptionPane.QUESTION_MESSAGE,
                null, new Object[]{"Pesos MX a otras modedas", "De otras monedas a Pesos MX"}, "Pesos MX a otras modedas");
        if (menu.equals("Pesos MX a otras modedas")) {

            convertirPeso(verificarNum());
        } else if (menu.equals("De otras monedas a Pesos MX")) {
            MonedaAPesosMX();
        }

    }

    public double verificarNum() {
        double num = 0.0;

        do {
            try {
                num = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingresa la cantidad:", "Entrada de datos", JOptionPane.INFORMATION_MESSAGE));

            } catch (NumberFormatException nfe) {
                JOptionPane.showMessageDialog(null, "Error, debes ingresar datos validos", "Massage Error", JOptionPane.ERROR_MESSAGE);
            }

        } while (num == 0);
        return num;
    }
}
