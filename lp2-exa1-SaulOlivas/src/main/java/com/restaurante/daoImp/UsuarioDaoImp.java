package com.restaurante.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.restaurante.dao.UsuarioDao;
import com.restaurante.entity.Usuario;

@Repository

public class UsuarioDaoImp implements UsuarioDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@Override
	public Usuario read(String nomuser) {
		String sql = "select * from usuario where nomuser = ?";
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForObject(sql, new Object[]{nomuser}, new BeanPropertyRowMapper<Usuario>(Usuario.class));
	}

	@Override
	public int create(Usuario u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Usuario u) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return null;
	}

}
