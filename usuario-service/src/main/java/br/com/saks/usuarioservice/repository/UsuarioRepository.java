/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saks.usuarioservice.repository;

import br.com.saks.usuarioservice.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author 7755287
 */
public interface UsuarioRepository extends JpaRepository<Usuario, Long>{
    
}
