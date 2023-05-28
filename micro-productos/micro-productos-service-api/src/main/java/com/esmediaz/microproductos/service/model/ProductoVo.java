package com.esmediaz.microproductos.service.model;

import java.net.URI;
import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.time.LocalDateTime;
import org.springframework.format.annotation.DateTimeFormat;
import java.time.OffsetDateTime;
import javax.validation.Valid;
import javax.validation.constraints.*;
import io.swagger.v3.oas.annotations.media.Schema;


import java.util.*;
import javax.annotation.Generated;

/**
 * ProductoVo
 */
@com.fasterxml.jackson.annotation.JsonInclude(com.fasterxml.jackson.annotation.JsonInclude.Include.NON_NULL)

@Generated(value = "org.openapitools.codegen.languages.SpringCodegen", date = "2023-05-28T20:23:04.085550400+02:00[Europe/Madrid]")
public class ProductoVo {

  @JsonProperty("id")
  private Long id;

  @JsonProperty("nombreProducto")
  private String nombreProducto;

  @JsonProperty("unidades")
  private Integer unidades;

  @JsonProperty("precioVenta")
  private String precioVenta;

  /**
   * tipo de producto
   */
  public enum TipoProductoEnum {
    ACCESORIOS("accesorios"),
    
    BLUSAS("blusas"),
    
    JEANS("jeans");

    private String value;

    TipoProductoEnum(String value) {
      this.value = value;
    }

    @JsonValue
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }

    @JsonCreator
    public static TipoProductoEnum fromValue(String value) {
      for (TipoProductoEnum b : TipoProductoEnum.values()) {
        if (b.value.equals(value)) {
          return b;
        }
      }
      throw new IllegalArgumentException("Unexpected value '" + value + "'");
    }
  }

  @JsonProperty("tipoProducto")
  private TipoProductoEnum tipoProducto;

  @JsonProperty("fechaCreacion")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private LocalDateTime fechaCreacion;

  @JsonProperty("fechaModificacion")
  @DateTimeFormat(iso = DateTimeFormat.ISO.DATE_TIME)
  private LocalDateTime fechaModificacion;

  public ProductoVo id(Long id) {
    this.id = id;
    return this;
  }

  /**
   * Get id
   * @return id
  */
  
  @Schema(name = "id", example = "10", required = false)
  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }

  public ProductoVo nombreProducto(String nombreProducto) {
    this.nombreProducto = nombreProducto;
    return this;
  }

  /**
   * Get nombreProducto
   * @return nombreProducto
  */
  @NotNull 
  @Schema(name = "nombreProducto", example = "collar", required = true)
  public String getNombreProducto() {
    return nombreProducto;
  }

  public void setNombreProducto(String nombreProducto) {
    this.nombreProducto = nombreProducto;
  }

  public ProductoVo unidades(Integer unidades) {
    this.unidades = unidades;
    return this;
  }

  /**
   * Get unidades
   * @return unidades
  */
  
  @Schema(name = "unidades", example = "2", required = false)
  public Integer getUnidades() {
    return unidades;
  }

  public void setUnidades(Integer unidades) {
    this.unidades = unidades;
  }

  public ProductoVo precioVenta(String precioVenta) {
    this.precioVenta = precioVenta;
    return this;
  }

  /**
   * Get precioVenta
   * @return precioVenta
  */
  
  @Schema(name = "precioVenta", example = "8", required = false)
  public String getPrecioVenta() {
    return precioVenta;
  }

  public void setPrecioVenta(String precioVenta) {
    this.precioVenta = precioVenta;
  }

  public ProductoVo tipoProducto(TipoProductoEnum tipoProducto) {
    this.tipoProducto = tipoProducto;
    return this;
  }

  /**
   * tipo de producto
   * @return tipoProducto
  */
  @NotNull 
  @Schema(name = "tipoProducto", description = "tipo de producto", required = true)
  public TipoProductoEnum getTipoProducto() {
    return tipoProducto;
  }

  public void setTipoProducto(TipoProductoEnum tipoProducto) {
    this.tipoProducto = tipoProducto;
  }

  public ProductoVo fechaCreacion(LocalDateTime fechaCreacion) {
    this.fechaCreacion = fechaCreacion;
    return this;
  }

  /**
   * Get fechaCreacion
   * @return fechaCreacion
  */
  @Valid 
  @Schema(name = "fechaCreacion", required = false)
  public LocalDateTime getFechaCreacion() {
    return fechaCreacion;
  }

  public void setFechaCreacion(LocalDateTime fechaCreacion) {
    this.fechaCreacion = fechaCreacion;
  }

  public ProductoVo fechaModificacion(LocalDateTime fechaModificacion) {
    this.fechaModificacion = fechaModificacion;
    return this;
  }

  /**
   * Get fechaModificacion
   * @return fechaModificacion
  */
  @Valid 
  @Schema(name = "fechaModificacion", required = false)
  public LocalDateTime getFechaModificacion() {
    return fechaModificacion;
  }

  public void setFechaModificacion(LocalDateTime fechaModificacion) {
    this.fechaModificacion = fechaModificacion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductoVo productoVo = (ProductoVo) o;
    return Objects.equals(this.id, productoVo.id) &&
        Objects.equals(this.nombreProducto, productoVo.nombreProducto) &&
        Objects.equals(this.unidades, productoVo.unidades) &&
        Objects.equals(this.precioVenta, productoVo.precioVenta) &&
        Objects.equals(this.tipoProducto, productoVo.tipoProducto) &&
        Objects.equals(this.fechaCreacion, productoVo.fechaCreacion) &&
        Objects.equals(this.fechaModificacion, productoVo.fechaModificacion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, nombreProducto, unidades, precioVenta, tipoProducto, fechaCreacion, fechaModificacion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductoVo {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    nombreProducto: ").append(toIndentedString(nombreProducto)).append("\n");
    sb.append("    unidades: ").append(toIndentedString(unidades)).append("\n");
    sb.append("    precioVenta: ").append(toIndentedString(precioVenta)).append("\n");
    sb.append("    tipoProducto: ").append(toIndentedString(tipoProducto)).append("\n");
    sb.append("    fechaCreacion: ").append(toIndentedString(fechaCreacion)).append("\n");
    sb.append("    fechaModificacion: ").append(toIndentedString(fechaModificacion)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

