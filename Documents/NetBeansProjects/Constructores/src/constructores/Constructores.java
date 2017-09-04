/*
AUTOR: Genaro Enrique Martínez Barbosa, 5IM6
VERSIÓN: 1.0 

DESCRIPCIÓN: En este programa, se crean cuatro objetos de dos clases diferentes. Cada objeto tiene su propio constructor. 

OBSERVACIONES: 
Cada clase está en un paquete diferente.

COMPILACIÓN: Se compila en tiempo de ejecución. 
EJECUCIÓN: Se ejecuta al dar clic en Run File.
*/

package constructores;

/**
 *
 * @author Genaro Enrique Martínez Barbosa, 5IM6
 * @version 1.0
 * created on 2017-09-03
 */

public class Constructores {

    /**
     * En el main, se instancian cuatro objetos de dos clases.
     * La primer clase es cCarro, es decir, un objeto carro, similar al visto en clase.
     * La segunda clase es cPerro, es decir, un perro.
     * 
     * El primer objeto de cada clase utiliza un constructor por defecto, es decir, vacío y sin parámetros.
     * El segundo objeto utiliza un constructor de copia, el cual inicializa un objeto usando otro de la misma clase.
     * El tercero usa un constructor común, el cual recibe parámetros y se los asigna al objeto.
     * El cuarto, en el caso del carro, le da gasolina al mismo; de lo contrario, no serviría (visto en clase).
     * Respecto al perro, se le da comida y se le vacuna para que esté sano, y se despliega en consola el estado del perro.
     * Además, se despliegan las características de los objetos.
     * 
     * Cada método constructor está comentado en las clases respectivas.
     * @param args
     */
    public static void main(String[] args) {
        
        //Carros
        carros.cCarro coche1 = new carros.cCarro();
        carros.cCarro coche2 = new carros.cCarro(coche1);
        carros.cCarro coche3 = new carros.cCarro("Nissan Versa", 2012, "Gris");
        carros.cCarro coche4 = new carros.cCarro("Gasolina");
        
        //Perros
        perros.cPerro perro1 = new perros.cPerro();
        perros.cPerro perro2 = new perros.cPerro(perro1);
        perros.cPerro perro3 = new perros.cPerro("Bugly", 18, 48.5, "Café");
        perros.cPerro perro4 = new perros.cPerro("Comida", "Vacunado");
        
    }   
    
}
