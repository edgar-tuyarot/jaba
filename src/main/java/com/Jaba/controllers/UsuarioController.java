package com.Jaba.controllers;

import com.Jaba.dao.UsuarioDao;
import com.Jaba.models.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class UsuarioController implements UsuarioDao {

    @Autowired
    private UsuarioDao usuarioDao;

    @RequestMapping(value = "usuarios")
    public List<Usuario> getUsuarios(){

        return usuarioDao.getUsuarios()


    }



    @RequestMapping(value = "usuario/{id}")
    public Usuario getUsuario(@PathVariable String id){
        Usuario user1 = new Usuario();
        user1.setId(01);
        user1.setNombre("Edgar");
        user1.setApellido("Tuyarot");
        user1.setTelefono("3624555419");
        user1.setEmail("edgar.tuyarot@gmail.com");
        return user1;
    }

    @RequestMapping(value = "edit")
    public Usuario editarUsuario(){
        Usuario user1 = new Usuario();
        user1.setNombre("Edgar");
        user1.setApellido("Tuyarot");
        return user1;
    }
    @RequestMapping(value = "find")
    public Usuario buscarUsuario(){
        Usuario user1 = new Usuario();
        user1.setNombre("Edgar");
        user1.setApellido("Tuyarot");
        return user1;
    }
    @RequestMapping(value = "delete")
    public Usuario borrarUsuario(){
        Usuario user1 = new Usuario();
        user1.setNombre("Edgar");
        user1.setApellido("Tuyarot");
        return user1;
    }
}
