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
public class Producto {
    
    private String[] listaDeCodigos;
    private String[] listaDeNombres;
    private Double[] listaDePreciosUnitariosDeCompra;
    private int[] listaDePreciosUnitariosDeVenta;

    public Producto() {
    }
    
    public String[] getListaDeCodigos() {
        return listaDeCodigos;
    }

    public void setListaDeCodigos(String[] listaDeCodigos) {
        this.listaDeCodigos = listaDeCodigos;
    }

    public String[] getListaDeNombres() {
        return listaDeNombres;
    }

    public void setListaDeNombres(String[] listaDeNombres) {
        this.listaDeNombres = listaDeNombres;
    }

    public Double[] getListaDePreciosUnitariosDeCompra() {
        return listaDePreciosUnitariosDeCompra;
    }

    public void setListaDePreciosUnitariosDeCompra(Double[] listaDePreciosUnitariosDeCompra) {
        this.listaDePreciosUnitariosDeCompra = listaDePreciosUnitariosDeCompra;
    }

    public int[] getListaDePreciosUnitariosDeVenta() {
        return listaDePreciosUnitariosDeVenta;
    }

    public void setListaDePreciosUnitariosDeVenta(int[] listaDePreciosUnitariosDeVenta) {
        this.listaDePreciosUnitariosDeVenta = listaDePreciosUnitariosDeVenta;
    }
    
    public void agregarProducto(String codigo, String nombre, Double precioUnitarioDeCompra, int precioUnitarioDeVenta){
    
    }
    
    public void actualizarProducto(String codigo, String nuevoNombre, Double nuevoPrecioUnitarioDeCompra, int nuevoPrecioUnitarioDeVenta){
    
    }
    
    public void eliminarProducto (String codigo) {
    
    }
    
    public int consultarNumero (String codigo) {
    
    }
    
    public String consultarCodigo (int numero) {
    
    }
    
    public String consultarNombre (int numero) {
    
    }
    
    public Double consultrarPrecioUnitarioDeCompra (int numero){
    
    }
    
    public int consultarPrecioUnitarioDeVenta (int numero){
    
    }
    
    
    
    
    
    
}
