/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.sistemainformacion;
import javax.swing.JOptionPane;
/**
* Clase Java para implementar una superclase padre
* que maneja los datos de un objeto de tipo persona
* de forma genérica
*/
public class Persona {

//ATRIBUTOS DE LA CLASE
protected String nombre;
protected String apellido;
protected int edad;
protected double peso;

//CONSTRUCTOR DE LA CLASE
public Persona() {
// TODO Auto-generated constructor stub
}

//CONSTRUCTOR SOBRECARGADO
public Persona (String nombre, String apellido, int edad, double peso) {
this.nombre = nombre;
this.apellido = apellido;
this.edad = edad;
this.peso = peso;
}

//METODOS DE ENCAPSULAMIENTO
public String getNombre() {
return nombre;
}
public void setNombre(String nombre) {
this.nombre = nombre;
}
public String getApellido() {
return apellido;
}
public void setApellido(String apellido) {
this.apellido = apellido;
}
public int getEdad() {
return edad;
}
public void setEdad(int edad) {
this.edad = edad;
}
public double getPeso() {
return peso;
}
public void setPeso(double peso) {
this.peso = peso;
}

//METODOS GENERICOS PARA UN OBJETO DED TIPO PERSONA
//METODO PARA MOSTRAR LOS DATOS DE IDENTIFICACION DE LA PERSONA
public void imprimirDatosPersona () {
    String datosPersona = "";
    datosPersona = "Nombre " + nombre + "\n" + "Apellido: " + apellido + "\n" + "Edad: " + edad + "\n" + "Peso: " + peso;
    JOptionPane.showMessageDialog(null,datosPersona);
    definirEstadoPersona(edad);
}
//METODO PARA DEFINIR EL ESTADO DE LA PERSONA
public void definirEstadoPersona (int edad) {
    String estado = "";
    if (edad < 18) {
        estado = "Menor de edad";
    }
    else {
        estado = "Mayor de edad";
    }
    JOptionPane.showMessageDialog(null,"La persona" + nombre + " " + apellido + " es " + estado);
}
//METODO PARA LEER UN ENTERO(int)
public int leerDatoTipoEntero (String mensaje) {
    int valor = 0;
    try {
        valor = Integer.parseInt(JOptionPane.showInputDialog
        (null,mensaje));
    return (valor);
    }catch (Exception errorIngreso) {
    errorIngreso.printStackTrace();
return (0);
}
}
//METODO PARA LEER UN DOUBLE
public double leerDatoTipoReal (String mensaje) {
    double valor = 0.0;
    valor = Double.parseDouble(JOptionPane.showInputDialog(null,mensaje));
return (valor);
}
//METODO PARA LEER UN BOOLEANO
public boolean leerDatoTipoBooleano (String mensaje) {
    boolean valor = false;
    valor = Boolean.parseBoolean(JOptionPane.showInputDialog(null,mensaje));
return (valor);
}
public String leerDatoTipoCadena (String mensaje) {
    String valor = "";
    valor = JOptionPane.showInputDialog(null,mensaje);
return (valor);
}
}