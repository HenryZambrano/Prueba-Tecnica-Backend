package com.Backend.PruebaTecnica.repository;


import com.Backend.PruebaTecnica.model.Usuario;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IUsuarioRepository extends JpaRepository<Usuario, Long>{

}
