package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner leerTeclado = new Scanner(System.in);

        String nombre;
        String auto;
        double distanciaTotal;
        double precioXlitrocombustible = 12000;
        double litrosCombustiblex100km ;
        double totalCombustibleGastado;
        double precioTotal;


        System.out.println("***CALCULADORA DE VIAJE***");

        System.out.println("Querido conductor ¿Cual es tu nombre?");
        nombre = leerTeclado.nextLine();

        System.out.println("Que vehiculo conduces?");
        auto = leerTeclado.nextLine();

        System.out.println("¿Cuantos KM conduciste?");
        distanciaTotal = leerTeclado.nextDouble();

        System.out.println("¿Cuantos litros de combustible gasta tu vehiculo por cada 100KM");
        litrosCombustiblex100km = leerTeclado.nextDouble();

        //////////////////////////////////////////////////////////////////////

        totalCombustibleGastado = (distanciaTotal / 100) * litrosCombustiblex100km;

        precioTotal = totalCombustibleGastado * precioXlitrocombustible;

        //////////////////////////////////////////////////////////////////////////

        System.out.println("Apreciado " +nombre+ " su chatarra de " +auto+ " consumio un total de "
                        +totalCombustibleGastado+ " litros de combustible en su viaje");

        System.out.println("En total gastaste " +precioTotal+ " pesos en combustible");










































    }
}