package com.restaurante;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import com.restaurante.dao.UsuarioDao;

@SpringBootTest
class Lp2Exa1SaulOlivasApplicationTests {
	
	@Autowired
	private UsuarioDao usuariodao;

	@Test
	void contextLoads() {
		System.out.println(usuariodao.read("saulfer").getClave());
	}

}
