/*
AUTOR: Genaro Enrique Martínez Barbosa, 5IM6
VERSIÓN: 1.0 

DESCRIPCIÓN: Clase cPerro.

COMPILACIÓN: Se compila en tiempo de ejecución. 
EJECUCIÓN: Desde el Main, dar clic en Run File.
*/

package perros;

/**
 *
 * @author Genaro Enrique Martínez Barbosa, 5IM6
 * @version 1.0
 * created on 2017-09-03
 */

public class cPerro {
    private String _nombre;
    private int _edad;
    private double _peso;
    private String _color;
    private String _comida;
    private String _vacunas;
    
    /**
     * Constructor por defecto para la clase cPerro 
     */
    public cPerro(){    
        
    }
    
    /**
     * Constructor de copia para la clase cPerro 
     * @param perro
     */
    public cPerro(cPerro perro){
        this._nombre = perro._nombre;
        this._edad = perro._edad;
        this._peso = perro._peso;
        this._color = perro._color;
    }

    /**
     * Constructor común para la clase cPerro, con los siguientes parámetros
     * @param nombre
     * @param edad
     * @param peso
     * @param color
     */
    public cPerro(String nombre, int edad, double peso, String color) {
        this._nombre = nombre;
        this._edad = edad;
        this._peso = peso;
        this._color = color;
    }
    
    /**
     * Constructor común para la clase cPerro, preguntando si ya comió y si está vacunado
     * @param comida
     * @param vacunas
     */
    public cPerro(String comida, String vacunas)
    {
        this._comida = comida;
        this._vacunas = vacunas;        
        
        if (comida.equals("Comida"))
            System.out.println("El perro ya comió (guau guau)");
        else 
            System.out.println("El perro no ha comido (grrrrrr...)");
        
        if (vacunas.equals("Vacunado"))
            System.out.println("Y no hace nada, está vacunado");
        else 
            System.out.println("Y no te le acerques, no está vacunado");
    }   
     
}
