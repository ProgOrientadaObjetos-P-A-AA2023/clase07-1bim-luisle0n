/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

public class Profesor2{
    private String nombre;
    private String tipo;
    private int edad;
    public Profesor2(String n, String t,int e){
        nombre = n;
        tipo = t;
        edad=e;
    }
    
    public void establecerNombre(String n){
        nombre = n;
    }
    
    public void establecerTipo(String n){
        tipo = n;
    }
     public void establecerEdad(int n){
        edad = n;
    }
    public String obtenerNombre(){
        return nombre;
    }
    public int obtenerEdad(){
        return edad;
    }
    
    public String obtenerTipo(){
        return tipo;
    }
     @Override
    public String toString() {
        String cadena = "Lista Profesores\n";
        cadena = String.format("Nombre: %s\nTipo: %s\nEdad: %d\n",obtenerNombre(),obtenerTipo(),obtenerEdad()); 
        return cadena;
    }
}
