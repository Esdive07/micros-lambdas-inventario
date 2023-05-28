/**
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech) (6.2.1).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package com.esmediaz.microproductos.service.api;

import com.esmediaz.microproductos.service.model.ProductoVo;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.Parameter;
import io.swagger.v3.oas.annotations.Parameters;
import io.swagger.v3.oas.annotations.media.Content;
import io.swagger.v3.oas.annotations.media.Schema;
import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.security.SecurityRequirement;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.context.request.NativeWebRequest;
import org.springframework.web.multipart.MultipartFile;

import javax.validation.Valid;
import javax.validation.constraints.*;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import javax.annotation.Generated;

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T20:23:04.085550400+02:00[Europe/Madrid]")
@Validated
@Tag(name = "producto", description = "the producto API")
public interface ProductoApi {

    /**
     * PUT /producto : Actualiza un producto existente
     * Actualiza un producto existente por id
     *
     * @param productoVo Actualiza un producto existente (required)
     * @return Ok (status code 200)
     *         or Id no valido (status code 400)
     *         or Producto no encontrado (status code 404)
     *         or Excepcion (status code 405)
     */
    @Operation(
        operationId = "actualizaProducto",
        summary = "Actualiza un producto existente",
        tags = { "producto" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Ok", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ProductoVo.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = ProductoVo.class))
            }),
            @ApiResponse(responseCode = "400", description = "Id no valido"),
            @ApiResponse(responseCode = "404", description = "Producto no encontrado"),
            @ApiResponse(responseCode = "405", description = "Excepcion")
        }
    )
    @RequestMapping(
        method = RequestMethod.PUT,
        value = "/producto",
        produces = { "application/json", "application/xml" },
        consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" }
    )
    ResponseEntity<ProductoVo> actualizaProducto(
        @Parameter(name = "ProductoVo", description = "Actualiza un producto existente", required = true) @Valid @RequestBody ProductoVo productoVo
    );


    /**
     * GET /producto/{id} : obtiene producto por id
     * retorna un producto de acuerdo al id
     *
     * @param id Id de producto a retornar (required)
     * @return Ok (status code 200)
     *         or Id no valido (status code 400)
     *         or Producto no encontrado (status code 404)
     */
    @Operation(
        operationId = "consultaProductoId",
        summary = "obtiene producto por id",
        tags = { "producto" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Ok", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ProductoVo.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = ProductoVo.class))
            }),
            @ApiResponse(responseCode = "400", description = "Id no valido"),
            @ApiResponse(responseCode = "404", description = "Producto no encontrado")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/producto/{id}",
        produces = { "application/json", "application/xml" }
    )
    ResponseEntity<ProductoVo> consultaProductoId(
        @Parameter(name = "id", description = "Id de producto a retornar", required = true) @PathVariable("id") Long id
    );


    /**
     * GET /producto/findByStatus : Encuentra producto por tipo
     * Encuentra producto por tipo
     *
     * @param tipoProducto filtra por tipo producto (optional, default to accesorios)
     * @return Ok (status code 200)
     *         or Tipo no valido (status code 400)
     */
    @Operation(
        operationId = "consultaProductoPorTipo",
        summary = "Encuentra producto por tipo",
        tags = { "producto" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Ok", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ProductoVo.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = ProductoVo.class))
            }),
            @ApiResponse(responseCode = "400", description = "Tipo no valido")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/producto/findByStatus",
        produces = { "application/json", "application/xml" }
    )
    ResponseEntity<List<ProductoVo>> consultaProductoPorTipo(
        @Parameter(name = "tipoProducto", description = "filtra por tipo producto") @Valid @RequestParam(value = "tipoProducto", required = false, defaultValue = "accesorios") String tipoProducto
    );


    /**
     * GET /producto : COnsulta todos los productos
     * COnsulta todos los productos
     *
     * @return Successful operation (status code 200)
     *         or producto no encontrados (status code 404)
     *         or excepcion (status code 405)
     */
    @Operation(
        operationId = "consultaProductos",
        summary = "COnsulta todos los productos",
        tags = { "producto" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ProductoVo.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = ProductoVo.class))
            }),
            @ApiResponse(responseCode = "404", description = "producto no encontrados"),
            @ApiResponse(responseCode = "405", description = "excepcion")
        }
    )
    @RequestMapping(
        method = RequestMethod.GET,
        value = "/producto",
        produces = { "application/json", "application/xml" }
    )
    ResponseEntity<ProductoVo> consultaProductos(
        
    );


    /**
     * POST /producto : Adiciona un nuevo producto
     * Adiciona un nuevo producto
     *
     * @param productoVo crea un nuevo producto (required)
     * @return Successful operation (status code 200)
     *         or Invalid input (status code 405)
     */
    @Operation(
        operationId = "crearProducto",
        summary = "Adiciona un nuevo producto",
        tags = { "producto" },
        responses = {
            @ApiResponse(responseCode = "200", description = "Successful operation", content = {
                @Content(mediaType = "application/json", schema = @Schema(implementation = ProductoVo.class)),
                @Content(mediaType = "application/xml", schema = @Schema(implementation = ProductoVo.class))
            }),
            @ApiResponse(responseCode = "405", description = "Invalid input")
        }
    )
    @RequestMapping(
        method = RequestMethod.POST,
        value = "/producto",
        produces = { "application/json", "application/xml" },
        consumes = { "application/json", "application/xml", "application/x-www-form-urlencoded" }
    )
    ResponseEntity<ProductoVo> crearProducto(
        @Parameter(name = "ProductoVo", description = "crea un nuevo producto", required = true) @Valid @RequestBody ProductoVo productoVo
    );

}
