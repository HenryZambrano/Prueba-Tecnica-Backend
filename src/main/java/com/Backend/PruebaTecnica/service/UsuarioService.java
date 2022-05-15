package com.Backend.PruebaTecnica.service;

import com.Backend.PruebaTecnica.model.Usuario;
import com.Backend.PruebaTecnica.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UsuarioService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario create (Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public Usuario update (Usuario usuario){
        return usuarioRepository.save(usuario);
    }

    public List<Usuario> listar(){
        return usuarioRepository.findAll();
    }

    public void delete(Usuario usuario){
         usuarioRepository.delete(usuario);
    }


}
