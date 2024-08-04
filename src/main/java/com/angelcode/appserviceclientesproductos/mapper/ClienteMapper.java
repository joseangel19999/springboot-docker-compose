package com.angelcode.appserviceclientesproductos.mapper;

import java.util.List;
import java.util.stream.Collectors;

import com.angelcode.appserviceclientesproductos.dto.ClienteDto;
import com.angelcode.appserviceclientesproductos.entity.ClienteEntity;

public class ClienteMapper {
	
	public static ClienteEntity maperClienteDtoToClienteEntity(ClienteDto clienteDto) {
		return new ClienteEntity(clienteDto.getId(),clienteDto.getNombre(),clienteDto.getApellidos(),clienteDto.getEdad());
	}

	public static List<ClienteDto> maperListClienteEntityToListClienteDto(List<ClienteEntity> listCliente){
		return listCliente.stream().map(c->new ClienteDto(c.getIdCliente(),c.getNombre(),c.getApellidos(),c.getEdad())).collect(Collectors.toList());
	}
}
