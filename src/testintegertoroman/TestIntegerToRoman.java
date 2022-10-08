/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package testintegertoroman;

/**
 *
 * @author delga
 */
public class TestIntegerToRoman {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println(intToRoman(1021));
        System.out.println(intToRoman(58));
    }

    public static String intToRoman(int num) {
        if (num < 1 || num > 3999) {
            return "";
        }
        int unidad = num % 10;
        int decena = (num % 100 - num % 10) / 10;
        int centena = (num % 1000 - num % 100) / 100;
        int unidadMil = (num % 10000 - num % 1000) / 1000;

        String resultado = "";
        for (int i = 0; i < unidadMil; i++) {
            resultado += "M";
        }
        if (centena != 9 && centena != 4) {
            resultado += centena >= 5 ? "D" : "";
            for (int i = 0; i < (centena >= 5 ? centena - 5 : centena); i++) {
                resultado += "C";
            }
        } else {
            resultado += centena == 9 ? "CM" : "CD";
        }
        if (decena != 9 && decena != 4) {
            resultado += decena >= 5 ? "L" : "";
            for (int i = 0; i < (decena >= 5 ? decena - 5 : decena); i++) {
                resultado += "X";
            }
        } else {
            resultado += decena == 9 ? "XC" : "XL";
        }
        if (unidad != 9 && unidad != 4) {
            resultado += unidad >= 5 ? "V" : "";
            for (int i = 0; i < (unidad >= 5 ? unidad - 5 : unidad); i++) {
                resultado += "I";
            }
        } else {
            resultado += unidad == 9 ? "IX" : "IV";
        }

        return resultado;
    }

}
