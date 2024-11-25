/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package uam.azc;

import azc.uam.mx.operacionArreglo;
import java.util.Arrays;
import static azc.uam.mx.operacionAvanzada.elevarPotencia;
import static azc.uam.mx.operacionAvanzada.validarAmigos;
import static azc.uam.mx.operacionAvanzada.validarAmstrong;
import static azc.uam.mx.operacionAvanzada.calcularEcuaciones;
import static azc.uam.mx.operacionAvanzada.calcularFibonacci;
import azc.uam.mx.operacionCadena;

/**
 * Clase principal que prueba diversas operaciones utilizando diferentes clases de la librería.
 * Incluye operaciones avanzadas matemáticas, operaciones sobre arreglos y cadenas.
 * Esta clase importa métodos estáticos de la clase operacionAvanzada y utiliza instancias de las clases operacionArreglo y operacionCadena.
 * @author Equipo 6 
 */
public class Main {

    /**
     * /**
     * Método principal que se encarga de ejecutar la lógica del código y probar todos los métodos importados.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        operacionArreglo op = new operacionArreglo();
        int[] arreglo = {15,25,69,85,100,22,33,64,15};
        System.out.println(op.calcularPromedio(arreglo));
        
        operacionArreglo op1 = new operacionArreglo();
        int[] arreglo1 = {15,25,69,85,100,22,33,64,15};
        System.out.println(Arrays.toString(op.obtenerMayoresPromedio(arreglo1)));
        
        operacionArreglo op2 = new operacionArreglo();
        int[] arreglo2 = {1,2,3,5,6,7};
        System.out.println(Arrays.toString(op.insertar(arreglo2, 4, 3)));
        
        operacionArreglo op3 = new operacionArreglo();
        int[] arreglo3 = {10, 20, 30, 40, 50,60, 70};
        System.out.println(op3.sumarPosicionesImpares(arreglo3, 2));
        
        operacionArreglo op4 = new operacionArreglo();
        int[] arreglo4 = {15, 25, 69, 85,100, 22, 33, 64, 15};
        System.out.println(Arrays.toString(op4.ordenar(arreglo4)));
        // Prueba de elevaPotencia
        int potencia = elevarPotencia(2, 3);
        System.out.println("2^3 = " + potencia);

        // Prueba de validarAmigos
        boolean amigos = validarAmigos(220, 284);
        System.out.println("220 y 284 son amigos: " + amigos);

        // Prueba de calcularFibonacci
        int fibonacci = calcularFibonacci(10);
        System.out.println("El 10mo termino de Fibonacci es: " + fibonacci);

        // Prueba de calcularEcuaciones
        String ecuacion = calcularEcuaciones(1, -3, 2);
        System.out.println("Soluciones de la ecuacion 1x^2 - 3x + 2: " + ecuacion);

        // Prueba de validarAmstrong
        boolean amstrong = validarAmstrong(153);
        System.out.println("153 es un numero Armstrong: " + amstrong);
    
        operacionCadena ops = new operacionCadena();
        
        System.out.println(ops.contarCoincidentes("Morlow", "Marlowes"));
        System.out.println(ops.calcularSimilitud("Morlow", "Marlowes"));
        System.out.println(ops.contarMinusculas("Laboratorio de Programacion Orientada a Objetos"));
        System.out.println(ops.contarConsonantes("Laboratorio de Programacion Orientada a Objetos"));
        System.out.println(ops.reemplazarVocales("SISTEMAS"));
        System.out.println(ops.esPalinromo("Laboratorio"));
        System.out.println(ops.esPalinromo("Anita lava la tina"));
    }
}
