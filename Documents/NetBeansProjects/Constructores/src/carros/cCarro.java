/*
AUTOR: Genaro Enrique Martínez Barbosa, 5IM6
VERSIÓN: 1.0 

DESCRIPCIÓN: Clase cCarro.

COMPILACIÓN: Se compila en tiempo de ejecución. 
EJECUCIÓN: Desde el Main, dar clic en Run File.
*/

package carros;

/**
 *
 * @author Genaro Enrique Martínez Barbosa, 5IM6
 * @version 1.0
 * created on 2017-09-03
 */


public class cCarro {
    private String _marca;
    private int _modelo;
    private String _color;
    private String _gasolina;
    
    /**
     * Constructor por defecto para la clase cCarro 
     */   
    public cCarro(){
        
    }
    
    /**
     * Constructor de copia para la clase cCarro 
     * @param coche
     */
    public cCarro(cCarro coche){    
        this._marca = coche._marca;
        this._modelo = coche._modelo;
        this._color = coche._color;
    }
    
    /**
     * Constructor común para la clase cCarro, con los siguientes parámetros
     * @param marca
     * @param modelo
     * @param color
     */
    public cCarro(String marca, int modelo, String color){    
        this._marca = marca;
        this._modelo = modelo;
        this._color = color;
    }
    
    /**
     * Constructor común para la clase cCarro, en donde se le abastece gasolina
     * @param gasolina
     */    
    public cCarro(String gasolina)
    {
        this._gasolina = gasolina;
        
        if (this._gasolina.equals("Gasolina"))
            System.out.println("El carro tiene gasolina");
        else
            System.out.println("El carro no arranca sin gasolina");
        
    }
}
