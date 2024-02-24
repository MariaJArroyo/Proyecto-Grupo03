/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package eedd.proyectofinal;

/**
 *
 * @author SaidL
 */
public class Residuo {
    private String nombreResiduo;
    private String tipoResiduo;

    public Residuo(String nombreResiduo, String tipoResiduo) {
        this.nombreResiduo = nombreResiduo;
        this.tipoResiduo = tipoResiduo;
    }

    public String getNombreResiduo() {
        return nombreResiduo;
    }

    public void setNombreResiduo(String nombreResiduo) {
        this.nombreResiduo = nombreResiduo;
    }

    public String getTipoResiduo() {
        return tipoResiduo;
    }

    public void setTipoResiduo(String tipoResiduo) {
        this.tipoResiduo = tipoResiduo;
    }
    
    public String impriprimirResiduo(){
      return "Residuo:" + this.nombreResiduo + " Tipo: " + this.tipoResiduo;   
    }
}
