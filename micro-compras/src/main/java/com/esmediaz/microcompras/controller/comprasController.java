package com.esmediaz.microcompras.controller;

import org.springframework.http.ResponseEntity;

import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.responses.ApiResponses;
import io.swagger.v3.oas.annotations.tags.Tag;

import com.esmediaz.microcompras.model.comprasVo;

@Tag(name = "compras")
public interface comprasController {

	@Operation(summary = "Post add new compras")
	@ApiResponses(value = {
			@ApiResponse(responseCode = "201", description = "compras was created"),
			@ApiResponse(responseCode = "400", description = "Bad request", content = @Content),
			@ApiResponse(responseCode = "401", description = "Unauthorized", content = @Content),
			@ApiResponse(responseCode = "403", description = "Forbidden", content = @Content),
			@ApiResponse(responseCode = "500", description = "Internal server error", content = @Content)
	})
	public ResponseEntity<comprasVo> addcompras(comprasVo comprasVo);
}
