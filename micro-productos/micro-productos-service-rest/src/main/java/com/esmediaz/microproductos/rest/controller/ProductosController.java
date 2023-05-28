package com.esmediaz.microproductos.rest.controller;

import java.util.List;

import javax.validation.Valid;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esmediaz.microproductos.rest.service.ProductosService;
import com.esmediaz.microproductos.service.api.ProductoApi;
import com.esmediaz.microproductos.service.model.ProductoVo;

import io.swagger.v3.oas.annotations.parameters.RequestBody;
import lombok.AllArgsConstructor;

@RestController
@RequestMapping("/public")
@AllArgsConstructor
public class ProductosController implements ProductoApi {

	private ProductosService producto;
	
	@PostMapping("/producto")
	@Override
	public ResponseEntity<ProductoVo> crearProducto(@Valid @RequestBody ProductoVo producto) {
		return null;
	}

	@GetMapping
	@Override
	public ResponseEntity<ProductoVo> consultaProductos() {
		return null;
	}
	
	@Override
	public ResponseEntity<ProductoVo> actualizaProducto(@Valid ProductoVo producto) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<ProductoVo> consultaProductoId(Long id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public ResponseEntity<List<ProductoVo>> consultaProductoPorTipo(@Valid String tipoProducto) {
		// TODO Auto-generated method stub
		return null;
	}




}
