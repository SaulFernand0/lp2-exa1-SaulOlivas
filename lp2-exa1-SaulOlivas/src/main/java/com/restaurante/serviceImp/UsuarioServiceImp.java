package com.restaurante.serviceImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.restaurante.dao.UsuarioDao;
import com.restaurante.entity.Usuario;
import com.restaurante.service.UsuarioService;

@Service

public class UsuarioServiceImp implements UsuarioService{
	
	@Autowired
	private UsuarioDao usuariodao; 

	@Override
	public int create(Usuario u) {
		// TODO Auto-generated method stub
		return usuariodao.create(u);
	}

	@Override
	public int update(Usuario u) {
		// TODO Auto-generated method stub
		return usuariodao.update(u);
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return usuariodao.delete(id);
	}

	@Override
	public Usuario read(String nomuser) {
		// TODO Auto-generated method stub
		return usuariodao.read(nomuser);
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return usuariodao.readAll();
	}
}
