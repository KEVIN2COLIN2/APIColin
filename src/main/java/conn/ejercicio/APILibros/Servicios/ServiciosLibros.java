/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conn.ejercicio.APILibros.Servicios;

import conn.ejercicio.APILibros.Entidades.IDLibros;
import conn.ejercicio.APILibros.Repositorios.RepositorioLibros;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author author
 */
@Service
public class ServiciosLibros {
    @Autowired
    RepositorioLibros RL;
    
    public List<IDLibros> obtenerTodosLosLibros(){
    return RL.findAll();
    }
    
    
    public boolean insertarLibro(IDLibros L){
    boolean respuesta = false;
    try{
    RL.save(L); //insert o update a base de datos
    respuesta = true;
    }catch(Exception ex){
        respuesta=false;
    }
    
    return respuesta;
    }
    
    
    public boolean actualizarLibro(IDLibros L){
    boolean respuesta = false;
    try{
    RL.save(L); //insert o update a base de datos
    respuesta = true;
    }catch(Exception ex){
        respuesta=false;
    }
    
    return respuesta;
    }
    
    
    public boolean eliminarLibro(IDLibros L){
    boolean respuesta = false;
    try{
    RL.delete(L); //insert o update a base de datos
    respuesta = true;
    }catch(Exception ex){
        respuesta=false;
    }
    
    return respuesta;
    }

    
    
}
