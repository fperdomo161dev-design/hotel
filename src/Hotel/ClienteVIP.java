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

public class ClienteVIP extends Cliente {
    
    
    public ClienteVIP (String nombre, String cedula, String numCelular, LocalDate FechaIngreso, LocalDate FechaSalida){
        
        super(nombre, cedula, numCelular, FechaIngreso, FechaSalida);
        
        
    }
    
    
    @Override
    public void mostrarInformacionCliente() {
        super.mostrarInformacionCliente(); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
        System.out.println("Tipo de cliente: VIP");
    }
    
}
