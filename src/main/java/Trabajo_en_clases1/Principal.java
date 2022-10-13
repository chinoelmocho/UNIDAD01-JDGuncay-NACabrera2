/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajo_en_clases1;

/**
 *
 * @author David
 */
public class Principal {
    public static void main(String [] arga) {
    var progra = new Asignatura();
    progra.codigo=4752;
    progra.costohoras=6;
    progra.horas=200;
    progra.nombre="Programacion orientada a objetos ";
    progra.nombredeldocente="Mauricio Ortiz Ochoa";
    progra.vigente=true;
    System.out.println(progra.mostrarinformacion());
    System.out.println(progra.calcularprecio());
            
    
    var progra2 = new Asignatura();
    progra2.codigo=4152;
    progra2.costohoras=5;
    progra2.horas=100;
    progra2.nombre="Educacion fisica ";
    progra2.nombredeldocente="Pedro Mauricio";
    progra2.vigente=true;
    System.out.println(progra2.mostrarinformacion());
    System.out.println(progra2.calcularprecio());
    
    var progra3 = new Asignatura();
    progra3.codigo=2514;
    progra3.costohoras=7;
    progra3.horas=160;
    progra3.nombre="Calculo diferencial ";
    progra3.nombredeldocente="Ochoa Avila Juan";
    progra3.vigente=true;
    System.out.println(progra3.mostrarinformacion());
    System.out.println(progra3.calcularprecio());
    System.out.println("\n \n \n");
    
    var auto1 = new Auto();
    auto1.placa="ABC34";
    auto1.marca="Cherolet";
    auto1.propietario="Juan";
    auto1.años=2000;
    auto1.color="Rojo";
    auto1.precio=20000;
    
    var auto2 = new Auto();
    auto2.placa="ABF68";
    auto2.marca="Toyota";
    auto2.propietario="DAVID";
    
    var auto3 = new Auto();
    auto3.placa="ABF34";
    auto3.marca="Toyota";
    auto3.propietario="Guncay";
    
    var auto4 = new Auto();
    auto4.placa="ASC34";
    auto4.marca="jetour";
    auto4.propietario="pepe";
    
     var auto5 = new Auto();
    auto5.placa="AWC34";
    auto5.marca="Nose";
    auto5.propietario="cesar";
    
     var auto6 = new Auto();
    auto6.placa="CBC34";
    auto6.marca="Mercedes Bens";
    auto6.propietario="alex";
    
    System.out.println(auto1.mostrarinfo()+"\n");
    System.out.println("El auto es de "+auto1.getPAismarca()+"\n"+auto1.getProvincia()+"\n");
    System.out.println("el auto tiene "+auto1.calcularedad(2022));
            
            
    System.out.println(auto2.mostrarinfo()+"\n");
    System.out.println("El auto es de "+auto2.getPAismarca()+"\n");
    
    System.out.println(auto3.mostrarinfo()+"\n");
    System.out.println("El auto es de "+auto3.getPAismarca()+"\n");
    
    System.out.println(auto4.mostrarinfo()+"\n");
    System.out.println("El auto es de "+auto4.getPAismarca()+"\n");
    
    System.out.println(auto5.mostrarinfo()+"\n");
    System.out.println("El auto es de "+auto5.getPAismarca()+"\n");
    
    System.out.println(auto6.mostrarinfo()+"\n");
    System.out.println("El auto es de "+auto6.getPAismarca()+"\n  \n \n \n \n  ");
    
    
    
    var auto7 = new Auto();
    auto7.placa="ABC34";
    auto7.marca="Cherolet";
    auto7.propietario="Juan";
    auto7.años=2000;
    auto7.color="Rojo";
    auto7.precio=20000;
    
    System.out.println(auto7.mostrarinfo()+"\n");
    System.out.println("El auto es de "+auto7.getPAismarca()+"\n"+auto7.getProvincia()+"\n"+auto7.calcularDepreciacion(2022)+"\n"+auto7.calcularIva()+"\n"+auto7.costodematricula(2022));
    }   
}
