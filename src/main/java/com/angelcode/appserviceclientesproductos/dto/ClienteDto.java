package com.angelcode.appserviceclientesproductos.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ClienteDto {
	private Integer id;
	private String nombre;
	private String apellidos;
	private Integer edad;
}
