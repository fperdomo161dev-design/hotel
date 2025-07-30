/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;
/**
 *
 * @author User
 */
    
   
        // Crear un objeto Cliente con los datos ingresados
       public class main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // Esto debe coincidir con lo que escriba el usuario
        
        // Crear el objeto Scanner para leer datos del usuario

        // Solicitar nombre
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = sc.nextLine();

        // Solicitar cédula
        System.out.print("Ingrese la cédula del cliente: ");
        String cedula = sc.nextLine();
        
        System.out.println("ingrese numero telefonico");
        String numCelular = sc.nextLine();
        
        System.out.print("Ingrese fecha de ingreso (dd/mm/aaaa): ");
        String fechaIngresoStr = sc.nextLine();
        LocalDate FechaIngreso = LocalDate.parse(fechaIngresoStr, formato);

        System.out.print("Ingrese fecha de salida (dd/mm/aaaa): ");
        String fechaSalidaStr = sc.nextLine();
        LocalDate FechaSalida = LocalDate.parse(fechaSalidaStr, formato);
        
       System.out.println("El cliente es VIP? true/false:");
       boolean clienteVIP = Boolean.parseBoolean(sc.nextLine());
       //buscar habitaciones tipo oro
       Cliente cliente;
        if(clienteVIP){
             cliente= new ClienteVIP(nombre, cedula, numCelular, FechaIngreso, FechaSalida);
        }else{  // Buscar habitaciones tipo Plata o LowCost
           cliente= new Cliente(nombre, cedula, numCelular, FechaIngreso, FechaSalida); 
        }

        // Mostrar la información usando el método de la clase Cliente
        cliente.mostrarInformacionCliente();

        // Cerrar el scanner
        sc.close();
        

        
        
       
    }
}
    

