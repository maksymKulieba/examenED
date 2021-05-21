/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package prestamo;

/**
 *
 * @author Javier Bustamante Toledo
 * 
 * Situación: Supongamos que tenemos una aplicación que autoriza el prestamo de una 
 * cantidad de dinero (valor numérico) si en importe se encuentra entre 1000 y 15000. 
 * Por lo tanto, 
 *  Todo préstamo por debajo de 1000 carece de interes y 
 *  Por encima de 15000 es una operación con demasiado riesgo.
 * 
 */
public class Prestamo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    }
    
    public String estudio (int cantidad) {
        String sRespuesta;
        
            if (cantidad >= 1000 && cantidad <=15000) {
                sRespuesta = "Felicidades, préstamo concedido";
            } else if (cantidad < 1000) {
                sRespuesta = "Préstamo no concedido carece de interes";
            } else {
                sRespuesta= "Préstamo no concedido es una operación con demasiado riesgo";
            }
        return sRespuesta;
    }
}


/*
RESPONDER AQUI EL PUNTO 1 DEL EXÁMEN.
Las particiones de equivalencias son, los valores menores de 1000 (partición invalida), los valores entre 
1000 y 15000 (valores validos) y los valores mayores a 15000. En cuanto a la prueba de valores borde, 
serian cuando el valor es igual a 1000 y cuando es igual a 15000.

Prueba de equivalencia
Caso 1.1:
Datos de entrada: valor menor a 1000.
Datos de salida esperados: Préstamo no concedido carece de interes.
Caso 1.2:
Datos de entrada: valor entre 1000 y 15000.
Datos de salida esperados: Felicidades, préstamo concedido.
Caso 1.3:
Datos de entrada: valor mayor a 15000
Datos de salida esperados: Préstamo no concedido es una operación con demasiado riesgo.

Prueba de valores borde
Caso 1.4:
Datos de entrada: valor igual a 1000.
Datos de salida esperados: Felicidades, préstamo concedido.
Caso 1.5:
Datos de entrada: valor igual a 15000.
Datos de salida esperados: Felicidades, préstamo concedido.

Prueba Parametrizada



*/