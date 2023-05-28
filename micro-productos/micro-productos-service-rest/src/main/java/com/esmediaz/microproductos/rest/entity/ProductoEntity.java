package com.esmediaz.microproductos.rest.entity;

import java.time.LocalDateTime;

import javax.persistence.Entity;

import lombok.Data;

@Entity
@Data
public class ProductoEntity {

	private Long id;
	private String nombreProducto;
	private Integer unidades;
	private String precioVenta;
	private String tipoProductoEnum;
	private LocalDateTime fechaCreacion;
	LocalDateTime fechaModificacion;
	

}
