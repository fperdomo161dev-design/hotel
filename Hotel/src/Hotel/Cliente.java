/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Hotel;
/**
 *
 * @author User
 */
public class Cliente {
 //Atributo para agregar nombre    
 private String nombre;
 //Atributo para agregar cedula
 private String cedula;
 private String numCelular;
 //constructor que recibe nombre y cedula
 public Cliente (String nombre, String cedula, String numCelular) {
     this.nombre = nombre;
     this.cedula = cedula;
     this.numCelular = numCelular;
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
 public void mostrarInformacionCliente() {
     
     System.out.println("cliente:" +nombre+ "- cedula:" +cedula+ "- Numero celular: " +numCelular);
 }
 
 
}
