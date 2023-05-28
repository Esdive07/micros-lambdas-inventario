package com.esmediaz.microproductos.rest.service;

import com.esmediaz.microproductos.service.model.ProductoVo;

public interface ProductosService {

	public ProductoVo crearProducto(ProductoVo productoVo);
	
	public ProductoVo consultaProductos();
}
