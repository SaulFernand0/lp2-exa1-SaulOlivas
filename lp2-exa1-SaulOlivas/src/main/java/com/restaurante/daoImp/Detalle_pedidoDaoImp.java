package com.restaurante.daoImp;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.restaurante.dao.Detalle_pedidoDao;
import com.restaurante.entity.Detalle_pedido;
import com.restaurante.entity.Usuario;

@Repository

public class Detalle_pedidoDaoImp implements Detalle_pedidoDao{
	
	@Autowired
	private JdbcTemplate jdbcTemplate;

	@Override
	public int create(Detalle_pedido dp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int update(Detalle_pedido dp) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int delete(int id) {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public Detalle_pedido read(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Map<String, Object>> readAll() {
		// TODO Auto-generated method stub
		return jdbcTemplate.queryForList("select * from Detalle_pedido");
	}

}
