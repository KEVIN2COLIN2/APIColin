/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package conn.ejercicio.APILibros.Repositorios;

import conn.ejercicio.APILibros.Entidades.IDLibros;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author author
 */
@Repository
public interface RepositorioLibros extends JpaRepository<IDLibros,Integer> {
    
}
