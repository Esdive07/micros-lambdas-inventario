package com.esmediaz.microcompras.controller.impl;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.esmediaz.microcompras.controller.comprasController;
import com.esmediaz.microcompras.model.comprasVo;

@RestController
@RequestMapping("/compras")
public class comprasControllerImpl implements comprasController {

	@PostMapping
	public ResponseEntity<comprasVo> addcompras(@RequestBody comprasVo comprasVo) {
		return ResponseEntity.status(HttpStatus.CREATED).body(comprasVo);
	}

}
