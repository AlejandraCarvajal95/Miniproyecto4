/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import modelo.Cliente;

/**
 *
 * @author aleja
 */
public class GestionCliente implements IGestionDatos{
    
    private ArrayList <Cliente> listaClientes;
    
    
        public GestionCliente(){
        listaClientes = new ArrayList();
        
    }
    
    public void agregar(Cliente c) {
        listaClientes.add(c);
    }      
    
    public Cliente obtenerClientePorCC(Integer cc) {
        
        Cliente resultado = null;
        for (Cliente cliente: listaClientes){
            if (cliente.getCedula()==cc){
                resultado = cliente;
                break;
            } else {
            }
            
        }
    return resultado;
    }
    
    public void actualizarCliente(Integer cedula, String nombres, String apellidos, Integer tarjetaDeCredito) {
       Cliente obtenido = obtenerClientePorCC(cedula);
       obtenido.setNombres(nombres);
       obtenido.setApellidos(apellidos);
       obtenido.setTarjetaDeCredito(tarjetaDeCredito);
    }
    
    public String listarClientes() {
     
     String cadena = "---------- Clientes ----------\n";
        for(Cliente cliente: listaClientes){ 
            cadena += cliente + "\n";
        }
        return cadena;
    }
    
    public void eliminarCliente(Integer cc) {
    Cliente aeliminar = obtenerClientePorCC(cc);
    int posicion = listaClientes.indexOf(aeliminar);
    listaClientes.remove(posicion);
    
        
        
    }
    
   
    
    @Override
    public void generarCSV() {
    
        String archivoCsv = "";
        for (Cliente cliente: listaClientes){
            archivoCsv += cliente.getCedula() + ";" + cliente.getNombres()
            + ";" + cliente.getApellidos() + ";" + cliente.getTarjetaDeCredito() + ";" + "\n";
        }
        try {
            /**
             * Metodo para la persistencia de datos en forma de archivo binario:
             */
            FileOutputStream os = new FileOutputStream(new File("src/persistencia/clientes_csv.txt"));
            System.out.println("Comenzando a copiar...");
            os.write(archivoCsv.getBytes());
            System.out.println("Copiado con exito!");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(GestionCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GestionCliente.class.getName()).log(Level.SEVERE, null, ex);
        }
    
    }

    @Override
    public void restaurarDatos() {
        
    File archivo = new File("src/persistencia/clientes_csv.txt");
        StringTokenizer st;
        String cadenaDatos = "";
        try {
            FileReader fr = new FileReader(archivo);
            try (BufferedReader br = new BufferedReader(fr)) {
                
                String cadena;
                while((cadena = br.readLine())!=null){
                    
                    cadenaDatos += cadena;
                    st = new StringTokenizer(cadena,";");
                    if (st.countTokens() % 4 == 0 && st.countTokens() != 0) {
                        
                        Integer cedula = Integer.parseInt(st.nextToken());
                        String nombres = st.nextToken();
                        String apellidos = st.nextToken();
                        Integer tarjetaDeCredito = Integer.parseInt(st.nextToken());
                        System.out.println("Creando y cargando cliente...");
                        Cliente cliente = new Cliente(cedula, nombres, apellidos, tarjetaDeCredito);
                        listaClientes.add(cliente);
                        System.out.println("cliente cargado con exito!");
                    } 
                }
                System.out.println("Se han cargado todos los datos exitosamente");
            }
        }
         catch (FileNotFoundException ex) {
            Logger.getLogger(GestionCliente.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(GestionCliente.class.getName()).log(Level.SEVERE, null, ex);
        } finally {
            System.out.println("Los datos contenidos en clientes_csv son: \n" + cadenaDatos);
            System.out.println("la lista de clientes resultante es: " + listaClientes);
        }
        
        
    }

    public ArrayList<Cliente> getListaClientes() {
        return listaClientes;
    }

 
}
