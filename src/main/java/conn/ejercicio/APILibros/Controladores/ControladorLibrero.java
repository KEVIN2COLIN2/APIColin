/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package conn.ejercicio.APILibros.Controladores;

import conn.ejercicio.APILibros.Entidades.IDLibros;
import conn.ejercicio.APILibros.Servicios.ServiciosLibros;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author author
 */
@RestController
@RequestMapping("/libreria")
public class ControladorLibrero {
    @Autowired
    ServiciosLibros SL;
    
    @GetMapping("/mensaje")
    public String mensaje(){
    return ("Has desplegado exitosamente en azure");}
    
    @GetMapping("/crud")
    public List<IDLibros> getTodosLosLibros(){
    return SL.obtenerTodosLosLibros();
    }
    
    @PostMapping("/crud")
    public List<IDLibros> postInsertarLibro(@RequestBody IDLibros L){
        
        if(SL.insertarLibro(L)){
        return SL.obtenerTodosLosLibros();
        }else{
        return null;
        }
    }
    
    @PutMapping("/crud")
    public List<IDLibros> puttInsertarLibro(@RequestBody IDLibros L){
        
        if(SL.actualizarLibro(L)){
        return SL.obtenerTodosLosLibros();
        }else{
        return null;
        }
    }
    
    @DeleteMapping("/crud")
    public List<IDLibros> deleteInsertarLibro(@RequestBody IDLibros L){
        
        if(SL.eliminarLibro(L)){
        return SL.obtenerTodosLosLibros();
        }else{
        return null;
        }
    }
}
