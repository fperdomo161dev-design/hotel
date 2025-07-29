/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;
import java.util.Scanner;
/**
 *
 * @author User
 */
    
    

public class main {
    public static void main(String[] args) {
        // Crear el objeto Scanner para leer datos del usuario
        Scanner sc = new Scanner(System.in);

        // Solicitar nombre
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = sc.nextLine();

        // Solicitar cédula
        System.out.print("Ingrese la cédula del cliente: ");
        String cedula = sc.nextLine();
        
        System.out.println("ingrese numero telefonico");
        String numCelular = sc.nextLine();

        // Crear un objeto Cliente con los datos ingresados
        Cliente cliente1 = new Cliente(nombre, cedula, numCelular);

        // Mostrar la información usando el método de la clase Cliente
        cliente1.mostrarInformacionCliente();

        // Cerrar el scanner
        sc.close();
        
       
    }
}
    

