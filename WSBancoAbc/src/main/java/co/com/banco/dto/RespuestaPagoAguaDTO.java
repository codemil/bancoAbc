package co.com.banco.dto;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import lombok.Data;

/**
 * DTO para la respuesta de pago de factura de agua
 * @author Mquintero
 *
 */
@JsonIgnoreProperties
@Data
public class RespuestaPagoAguaDTO {

	private long idFactura;
	
    private String mensaje;
    
}
