/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Trabajo_en_clases1;

/**
 *
 * @author PC-12
 */
public class Auto {

    String placa;
    String propietario;
    String marca;

    public String mostrarinfo() {
        var retorno = "EL auto tiene placa " + this.placa + " y es de maraca " + this.marca + " y el propietario es " + this.propietario;
        return retorno;
    }

    public String getProvincia() {
        var retorno = "";
        return retorno;

    }

    public String getPAismarca() {
        var retorno =" ";
        if(this.marca.equals("Cherolet")){
             retorno = " USA ";
        }else{if(this.marca.equals("Toyota")) {
             retorno = "Japon";
        }else{if(this.marca.equals("jetour")){
             retorno ="Japon";
        }else{if(this.marca.equals("Mercedes Bens")){
            retorno ="Alemania";
        }else{
            retorno ="No definido";
        }
        }
        }
        }
        
        return retorno;
    }}

    


