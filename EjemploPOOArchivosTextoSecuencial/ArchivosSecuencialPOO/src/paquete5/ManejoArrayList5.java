package paquete5;

import java.util.ArrayList;
import java.util.Arrays;

import paquete1.Profesor2;

public class ManejoArrayList5 {

    public static void main(String[] args) {
        String[] lineas = {"Tara Hernandes,Contrato ,30", "Luis Andrade,Factura,35", "Ana Juarez;nombramiento,Nombramiento,40"};
        for (int i = 0; i < lineas.length; i++) {
            ArrayList<String> linea_partes = new ArrayList<>(
                    Arrays.asList(lineas[i].split(","))
            );
            Profesor2 p = new Profesor2(linea_partes.get(0), linea_partes.get(1), Integer.parseInt(linea_partes.get(2))); // contratado;
            System.out.println(p);

        }

    }
}
