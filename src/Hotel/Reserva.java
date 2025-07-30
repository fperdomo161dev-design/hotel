/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author User
 */
    public class Reserva {
    private static int contador = 1; // Para generar ID de reserva automáticamente

    private int idReserva;
    private Cliente cliente;
    private Habitacion habitacion;
    private boolean activa;

    // Constructor
    public Reserva(Cliente cliente, Habitacion habitacion) {
        this.idReserva = contador++;
        this.cliente = cliente;
        this.habitacion = habitacion;
        this.activa = true;

        // Al crear la reserva, se marca la habitación como ocupada
        habitacion.reservar();
    }

    // Getters
    public int getIdReserva() {
        return idReserva;
    }

    public Cliente getCliente() {
        return cliente;
    }

    public Habitacion getHabitacion() {
        return habitacion;
    }

    public boolean estaActiva() {
        return activa;
    }

    // Cancelar la reserva
    public void cancelar() {
        if (activa) {
            activa = false;
            habitacion.liberar();
            System.out.println("Reserva #" + idReserva + " cancelada.");
        } else {
            System.out.println("La reserva ya estaba cancelada.");
        }
    }

    // Mostrar información
    public void mostrarInfo() {
        System.out.println("=== Reserva #" + idReserva + " ===");
        System.out.println("Cliente: " + cliente.getnombre() + " - Cédula: " + cliente.getcedula());
        System.out.println("Habitación Nº: " + habitacion.getNumero() + " (" + habitacion.getTipo() + ")");
        System.out.println("Estado: " + (activa ? "Activa" : "Cancelada"));
        System.out.println("-----------------------------");
    }
}


