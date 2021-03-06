package com.restaurante.service;

import java.util.List;
import java.util.Map;

import com.restaurante.entity.Detalle_pedido;

public interface Detalle_pedidoService {
	int create(Detalle_pedido dp);
    int update(Detalle_pedido dp);
    int delete(int id);
    Detalle_pedido read(int id);
    List<Map<String, Object>> readAll();
}
