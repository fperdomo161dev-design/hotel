/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;

/**
 *
 * @author User
 */
public class Habitacion {
    private int numero;
    private String tipo; // "LowCost", "Plata", "Oro"
    private boolean ocupada;
    private int piso;

    // Constructor para inicializar la habitación
    public Habitacion(int numero, String tipo, int piso) {
        this.numero = numero;
        this.tipo = tipo;
        this.piso = piso;
        this.ocupada = false; // Por defecto, la habitación está libre
    }

    // Getter para el número de la habitación
    public int getNumero() {
        return numero;
    }

    // Getter para el tipo de habitación
    public String getTipo() {
        return tipo;
    }

    // Getter para saber si está ocupada
    public boolean estaOcupada() {
        return ocupada;
    }

    // Getter para el piso
    public int getPiso() {
        return piso;
    }

    // Método para reservar la habitación
    public void reservar() {
        if (!ocupada) {
            ocupada = true;
            System.out.println("Habitación " + numero + " reservada exitosamente.");
        } else {
            System.out.println("La habitación " + numero + " ya está ocupada.");
        }
    }

    // Método para liberar la habitación
    public void liberar() {
        if (ocupada) {
            ocupada = false;
            System.out.println("Habitación " + numero + " ahora está disponible.");
        } else {
            System.out.println("La habitación " + numero + " ya está libre.");
        }
    }

    // Método para mostrar información de la habitación
    public void mostrarInfo() {
        System.out.println("Habitación Nº " + numero);
        System.out.println("Tipo: " + tipo);
        System.out.println("Piso: " + piso);
        System.out.println("Estado: " + (ocupada ? "Ocupada" : "Disponible"));
        System.out.println("-----------------------------");
    }
}

