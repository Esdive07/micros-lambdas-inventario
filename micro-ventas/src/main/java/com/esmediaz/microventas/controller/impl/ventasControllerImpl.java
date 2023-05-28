package com.esmediaz.microventas.controller.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esmediaz.microventas.controller.ventasController;
import com.esmediaz.microventas.model.ventasVo;

@RestController
@RequestMapping("/ventas")
public class ventasControllerImpl implements ventasController {

	@PostMapping
	public ResponseEntity<ventasVo> addventas(@RequestBody ventasVo ventasVo) {
		return ResponseEntity.status(HttpStatus.CREATED).body(ventasVo);
	}

}
