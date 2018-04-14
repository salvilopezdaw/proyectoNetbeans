/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practticanetbeans;

import java.util.Scanner;

/**
 *
 * @author Salvi-PC
 */
public class Practica {

    /**
     * Escribir en el entorno Netbeans un programa Java que realice una operación que sume N números y muestre el resultado.

Créalo con un error en el bucle.  Comprueba el error con Debug.
Cambia el nombre al método, con la herramienta correspondiente.
Desordena el texto y arréglalo de forma automática.
Realiza refactoring con los nombres de los métodos.
Realizar capturas de pantalla con diferentes vistas y explica brevemente las pantallas capturadas. Guarda todo en un documento de word y súbelo a Moodle. 
     */
    public static void sumarNumeros(){
        int num =0;
        int resultado=0;
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿ Cuantos numeros quiere sumar ?");
        num = teclado.nextInt();
        for(int x=1;x<=num;x++){
            System.out.println("Introduzca el numero a sumar en la posicion "+x);
            resultado += teclado.nextInt();
        }
            System.out.println("el resultado de la suma es "+resultado);  
    
    }
    
    public static void main(String[] args) {

        Practica.sumarNumeros();
    }

}
