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


public class Cliente {
 //Atributo para agregar informacion  
 private String nombre;
 private String cedula;
 private String numCelular;
 private LocalDate FechaIngreso;
 private LocalDate FechaSalida;
 //constructor que recibe nombre, cedula , celular , fecha ingreso y salida
 public Cliente (String nombre, String cedula, String numCelular,LocalDate FechaIngreso,LocalDate FechaSalida) {
     this.nombre = nombre;
     this.cedula = cedula;
     this.numCelular = numCelular;
     this.FechaIngreso = FechaIngreso;
     this.FechaSalida = FechaSalida;
 }
 //metodos
 public String getnombre (){
     return nombre;
 } 
 
 public void setnombre (String nombre){
     this.nombre =nombre;
 }
  
 public String getcedula (){
     return cedula;
 }
 
 public void setcedula(String cedula) {
     this.cedula = cedula;
 }
 
 public String getnumCelular (){
     return numCelular;
 }
 private void setnumCelular (String numCelular) {
  
     this.numCelular = numCelular;
 }
 public LocalDate getFechaIngreso(){
       return FechaIngreso;
 }
 
 public void setFechaIngreso(LocalDate FechaIngreso){
     this.FechaIngreso = FechaIngreso;
 }
 
 public LocalDate getFechaSalida (){
     return FechaSalida;
 }
 
 public void setFechaSalida ( LocalDate FechaSalida){
     this.FechaSalida = FechaSalida;
 }
 public void mostrarInformacionCliente() {
     
     System.out.println("cliente:" +nombre+ "- cedula:" +cedula+ "- Numero celular: " +numCelular+ "Fecha ingreso:"+FechaIngreso+ "Fecha salidas:"+FechaSalida);
 }
 
 
}
