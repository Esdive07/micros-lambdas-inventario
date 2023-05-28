package com.esmediaz.microproductos.rest.service.impl;

import org.springframework.stereotype.Service;

import com.esmediaz.microproductos.rest.service.ProductosService;
import com.esmediaz.microproductos.rest.util.MapperUtil;
import com.esmediaz.microproductos.service.model.ProductoVo;

import lombok.AllArgsConstructor;

@Service
@AllArgsConstructor
public class ProductosServiceImpl implements ProductosService {

	private MapperUtil mapper;

	@Override
	public ProductoVo crearProducto(ProductoVo productoVo) {

		return null;
	}

	@Override
	public ProductoVo consultaProductos() {
		// TODO Auto-generated method stub
		return null;
	}

}
