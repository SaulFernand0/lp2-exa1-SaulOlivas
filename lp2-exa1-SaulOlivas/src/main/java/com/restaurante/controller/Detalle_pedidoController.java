package com.restaurante.controller;

import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.restaurante.entity.Detalle_pedido;
import com.restaurante.service.Detalle_pedidoService;

@RestController
@RequestMapping("/detalle_pedido")

public class Detalle_pedidoController {
	
	 @Autowired
	 private Detalle_pedidoService detalle_pedidoService;

	 @GetMapping("/lista")
	 public List<Map<String,Object>>listar(){
		 return detalle_pedidoService.readAll();
	 } 
}
