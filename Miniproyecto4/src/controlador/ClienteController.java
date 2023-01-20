/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package controlador;

import DAO.GestionCliente;

import modelo.Cliente;

/**
 *
 * @author aleja
 */
public class ClienteController {
    
    public void crearCliente(Cliente c)
    {
        GestionCliente dao = new GestionCliente();
        dao.agregar(c);
    }
    
    public Cliente obtenerClientePorCC(Integer cc)
    {
        GestionCliente dao = new GestionCliente();
        return dao.obtenerClientePorCC(cc);
    }
    
    public String listarClientes(){
        GestionCliente dao = new GestionCliente();
        return dao.listarClientes();
    }
    
    public void actualizarCliente(Cliente c){
         
    GestionCliente dao = new GestionCliente();
    dao.actualizarCliente(c.getCedula(), c.getNombres(), c.getApellidos(), c.getTarjetaDeCredito());
    }
    
    public void eliminarCliente(Integer cc)
    {
    GestionCliente dao = new GestionCliente();
    dao.eliminarCliente(cc);
    }
}
