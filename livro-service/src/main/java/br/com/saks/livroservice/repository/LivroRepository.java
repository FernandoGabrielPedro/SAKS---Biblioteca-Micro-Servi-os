/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.com.saks.livroservice.repository;

import br.com.saks.livroservice.model.Livro;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 *
 * @author 7755287
 */
public interface LivroRepository extends JpaRepository<Livro, Long>{
    
}
