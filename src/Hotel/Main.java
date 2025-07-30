/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author User
 */

    

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Main{
    public static void main(String[] args) {
        // Crear el Scanner para leer entrada del usuario
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy"); // formato de fecha dd/mm/aaaa

        // Solicitar datos del cliente
        System.out.print("Ingrese el nombre del cliente: ");
        String nombre = sc.nextLine();

        System.out.print("Ingrese la cédula del cliente: ");
        String cedula = sc.nextLine();

        System.out.print("Ingrese número telefónico: ");
        String numCelular = sc.nextLine();

        System.out.print("Ingrese fecha de ingreso (dd/mm/aaaa): ");
        String fechaIngresoStr = sc.nextLine();
        LocalDate fechaIngreso = LocalDate.parse(fechaIngresoStr, formato);

        System.out.print("Ingrese fecha de salida (dd/mm/aaaa): ");
        String fechaSalidaStr = sc.nextLine();
        LocalDate fechaSalida = LocalDate.parse(fechaSalidaStr, formato);

        System.out.println("¿El cliente es VIP? (true/false):");
        boolean clienteVIP = Boolean.parseBoolean(sc.nextLine());

        // Crear cliente según su tipo
        Cliente cliente;
        if (clienteVIP) {
            cliente = new ClienteVIP(nombre, cedula, numCelular, fechaIngreso, fechaSalida);
        } else {
            cliente = new Cliente(nombre, cedula, numCelular, fechaIngreso, fechaSalida);
        }

        // Mostrar la información básica del cliente
        cliente.mostrarInformacionCliente();

        // Crear la lista de habitaciones disponibles
        ArrayList<Habitacion> habitaciones = new ArrayList<>();
        // Agregar habitaciones LowCost, Plata y Oro
        for (int i = 101; i <= 105; i++) habitaciones.add(new Habitacion(i, "LowCost", 1));
        for (int i = 201; i <= 205; i++) habitaciones.add(new Habitacion(i, "LowCost", 2));
        for (int i = 301; i <= 305; i++) habitaciones.add(new Habitacion(i, "Plata", 3));
        for (int i = 401; i <= 405; i++) habitaciones.add(new Habitacion(i, "Plata", 4));
        for (int i = 501; i <= 505; i++) habitaciones.add(new Habitacion(i, "Oro", 5));

        // Filtrar habitaciones disponibles según tipo de cliente
        ArrayList<Habitacion> disponibles = new ArrayList<>();
        for (Habitacion h : habitaciones) {
            if (!h.estaOcupada()) {
                if (clienteVIP && h.getTipo().equalsIgnoreCase("Oro")) {
                    disponibles.add(h);
                } else if (!clienteVIP && 
                          (h.getTipo().equalsIgnoreCase("Plata") || h.getTipo().equalsIgnoreCase("LowCost"))) {
                    disponibles.add(h);
                }
            }
        }

        // Si no hay habitaciones, salir
        if (disponibles.isEmpty()) {
            System.out.println("No hay habitaciones disponibles para este tipo de cliente.");
            return;
        }

        // Mostrar habitaciones disponibles
        System.out.println("\nHabitaciones disponibles:");
        for (Habitacion h : disponibles) {
            System.out.println("Número: " + h.getNumero() + " | Tipo: " + h.getTipo() + " | Piso: " + h.getPiso());
        }

        // Solicitar al usuario seleccionar una habitación
        System.out.print("Ingrese el número de habitación que desea reservar: ");
        int numeroElegido = sc.nextInt();
        sc.nextLine();  // limpiar buffer

        // Buscar la habitación seleccionada
        Habitacion habitacionSeleccionada = null;
        for (Habitacion h : disponibles) {
            if (h.getNumero() == numeroElegido) {
                habitacionSeleccionada = h;
                break;
            }
        }

        // Validar la habitación seleccionada
        if (habitacionSeleccionada == null) {
            System.out.println("Habitación no válida o ya no disponible.");
            return;
        }

        // Crear la reserva y marcar habitación como ocupada
        Reserva reserva = new Reserva(cliente, habitacionSeleccionada);

        // Mostrar los datos de la reserva por JOptionPane
        String mensaje = """
                         === DATOS DE LA RESERVA ===
                         Reserva #: """ + reserva.getIdReserva() + "\n"
                + "Cliente: " + cliente.getnombre() + "\n"
                + "Cédula: " + cliente.getcedula() + "\n"
                + "Teléfono: " + cliente.getnumCelular() + "\n"
                + "Fecha ingreso: " + cliente.getFechaIngreso() + "\n"
                + "Fecha salida: " + cliente.getFechaSalida() + "\n"
                + "Tipo de Cliente: " + (cliente instanceof ClienteVIP ? "VIP" : "Normal") + "\n"
                + "Habitación Nº: " + habitacionSeleccionada.getNumero() + "\n"
                + "Tipo de Habitación: " + habitacionSeleccionada.getTipo() + "\n"
                + "Piso: " + habitacionSeleccionada.getPiso();
        

        JOptionPane.showMessageDialog(null, mensaje);
        
     

        // Cerrar scanner
        sc.close();
    }
}


