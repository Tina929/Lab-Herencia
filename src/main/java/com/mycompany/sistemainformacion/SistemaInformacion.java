/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.sistemainformacion;
import javax.swing.JOptionPane;
/**
 * @author Ivone Lopez y Valentina Vargas
 */
public class SistemaInformacion {
    //Constructor de la clase
public SistemaInformacion() {
// TODO Auto-generated constructor stub
}

public static void main(String[] args) {
// TODO Auto-generated method stub
    int opcion = 0;
    Persona sistemaInformacion = new Persona();
    try {
//Usamos la herencia de la superclase para acceder a los
//métodos de lectura de datos
        do{
            opcion = sistemaInformacion.leerDatoTipoEntero("Ingrese la opción 1 para procesar los datos del empleado, 2 para procesar datos del estudiante, 3 para salir: ");
                if (opcion == 1) {
                    JOptionPane.showMessageDialog(null,"Procesando datos del empleado");
                    Empleado manejadorEmpleado = new Empleado();
                    //Leemos los datos
                    manejadorEmpleado =manejadorEmpleado.ingresarDatosEmpleado();
                    //Mostramos el reporte de datos
                    manejadorEmpleado.imprimirReporteEstadoEmpleado();
                } else if (opcion == 2){
                    //MENU DEL ESTUDIANTE:
                    String nombre = JOptionPane.showInputDialog(null, "Ingrese el nombre del estudiante:");
                    String apellido = JOptionPane.showInputDialog(null, "Ingrese el apellido del estudiante:");
                    int edad = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la edad del estudiante:"));
                    double peso = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el peso del estudiante:"));
                    String carnet = JOptionPane.showInputDialog(null, "Ingrese el carnet del estudiante:");
                    int numeroMaterias = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el número de materias que cursa el estudiante:"));

                    double[] notas = new double[numeroMaterias];
                    for (int i = 0; i < numeroMaterias; i++) {
                    notas[i] = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese la nota de la materia " + (i + 1) + ":"));
                    }
    
                    Estudiante estudiante = new Estudiante(nombre, apellido, edad, peso , carnet, numeroMaterias);
                    estudiante.calcularPromedioNotas(notas);
                    estudiante.imprimirReporteEstudiante(); 
                }
                else if (opcion == 3) {
                    JOptionPane.showMessageDialog(null,"Saliendo del Sistema");
                    break;
                }
                else {
                    JOptionPane.showMessageDialog(null,"Opción inválida");
                }
        }while (opcion <= 1 || opcion >= 3);//fin del do-while
    }//Fin del try
    catch (Exception errorMain) {
        JOptionPane.showMessageDialog(null,"Error en la digitación: ");
        errorMain.printStackTrace();
    }
}
}


