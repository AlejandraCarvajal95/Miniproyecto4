/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 * @authors:
 * Jhonnier Hernandez
 * Juan Cifuentes
 * Alejandra Carvajal
 */
public class Cliente {
    
    private final Integer cedula;
    private String nombres;
    private String apellidos;
    private Integer tarjetaDeCredito;

    public Cliente(Integer cedula, String nombres, String apellidos, Integer tarjetaDeCredito) {
        this.cedula = cedula;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.tarjetaDeCredito = tarjetaDeCredito;
    }

    public Integer getCedula() {
        return cedula;
    }
    
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public Integer getTarjetaDeCredito() {
        return tarjetaDeCredito;
    }

    public void setTarjetaDeCredito(Integer tarjetaDeCredito) {
        this.tarjetaDeCredito = tarjetaDeCredito;
    }

    @Override
    public String toString() {
        return "Cliente{" + "cedula=" + this.getCedula() + ", nombres=" + this.getNombres() + ", apellidos=" + this.getApellidos() + ", tarjeta de credito=" + this.getTarjetaDeCredito() + '}';
    }
}
