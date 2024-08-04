package com.angelcode.appserviceclientesproductos.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.angelcode.appserviceclientesproductos.dto.ClienteDto;
import com.angelcode.appserviceclientesproductos.entity.ClienteEntity;
import com.angelcode.appserviceclientesproductos.mapper.ClienteMapper;
import com.angelcode.appserviceclientesproductos.repository.ClienteRepository;

@Service
public class ClienteServiceImpl implements IClienteService {
	
	@Autowired
	private ClienteRepository clienteRepository;

	@Override
	public List<ClienteDto> getClientes() {
		return ClienteMapper.maperListClienteEntityToListClienteDto(this.clienteRepository.findAll());
	}

	@Override
	public ClienteDto getCliente(Integer id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void save(ClienteDto clienteDto) {
		ClienteEntity cliente= ClienteMapper.maperClienteDtoToClienteEntity(clienteDto);
		this.clienteRepository.save(cliente);
	}

	@Override
	public void update(ClienteDto clienteDto) {
		Optional<ClienteEntity> cliente=this.clienteRepository.findById(clienteDto.getId());
		if(cliente.isPresent()) {
			this.clienteRepository.save(ClienteMapper.maperClienteDtoToClienteEntity(clienteDto));
		}
	}

	@Override
	public void delete(Integer id) {
		// TODO Auto-generated method stub
		
	}

}
