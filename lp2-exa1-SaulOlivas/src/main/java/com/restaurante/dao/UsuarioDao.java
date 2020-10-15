package com.restaurante.dao;

import java.util.List;
import java.util.Map;

import com.restaurante.entity.Usuario;

public interface UsuarioDao {
	int create(Usuario u);
    int update(Usuario u);
    int delete(int id);
    Usuario read(String nomuser);
    List<Map<String, Object>> readAll();
}
