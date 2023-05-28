package com.esmediaz.microproductos.rest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.esmediaz.microproductos.rest.entity.ProductoEntity;

public interface ProductoRespositorio extends JpaRepository<ProductoEntity, Integer>{

}
