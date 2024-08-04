package com.angelcode.appserviceclientesproductos.service;

import java.util.List;

import com.angelcode.appserviceclientesproductos.dto.ClienteDto;

public interface IClienteService {

	public List<ClienteDto> getClientes();
	public ClienteDto getCliente(Integer id);
	public void save(ClienteDto clienteDto);
	public void update(ClienteDto clienteDto);
	public void delete(Integer id);
}
