package com.Backend.PruebaTecnica.controller;

import com.Backend.PruebaTecnica.model.Usuario;
import com.Backend.PruebaTecnica.service.UsuarioService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequestMapping("/usuarios")
public class UsuarioController {

    @Autowired
    private UsuarioService usuarioService;

    @PostMapping
    public Usuario create(@RequestBody Usuario usuario){
        return usuarioService.create(usuario);
    }

    @PutMapping
    public Usuario update(@RequestBody Usuario usuario){
        return usuarioService.update(usuario);

    }

    @GetMapping
    public List<Usuario> listar(){
        return usuarioService.listar();

    }

    @DeleteMapping
    public void delete(@RequestBody Usuario usuario){
        usuarioService.delete(usuario);
    }

}
