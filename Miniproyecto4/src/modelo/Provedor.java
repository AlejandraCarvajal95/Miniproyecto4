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
public class Provedor {
    
    private String[] listaDeCodigos;
    private String[] listaDeNombres;
    private String[] listaDeListasDeProductos;

    public Provedor() {
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

    public String[] getListaDeListasDeProductos() {
        return listaDeListasDeProductos;
    }

    public void setListaDeListasDeProductos(String[] listaDeListasDeProductos) {
        this.listaDeListasDeProductos = listaDeListasDeProductos;
    }
    
    public void agregarProvedor (String codigo, String nombre, String listaDeProductos){
    
    }
    
    public void actualizarProvedor (String codigo, String nuevoNombre, String nuevaListaDeProductos){
    
    }
    
    public void eliminarProvedor(String codigo){
    
    }
    
    public int consultarNumero(String codigo){
    
    }
    
    public String consultarCodigo (int numero){ 
    
    } 
    
    public String consultarNombre(int numero){ 
    
    } 
    
    public String consultarListaDeProductos(int numero){ 
    
    } 
    
    
  
    
}
