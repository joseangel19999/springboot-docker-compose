package com.angelcode.appserviceclientesproductos.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.angelcode.appserviceclientesproductos.dto.ClienteDto;
import com.angelcode.appserviceclientesproductos.service.IClienteService;

@RestController
@RequestMapping("/api/v1/cliente")
public class ClienteController {
	
	@Autowired
	private IClienteService clienteService;

	@GetMapping
	public ResponseEntity<List<ClienteDto>> getClientes(){
		new ResponseEntity<List<ClienteDto>>(HttpStatus.OK);
		return ResponseEntity.ok(this.clienteService.getClientes());
	}
	
	@PostMapping
	public ResponseEntity<String> saveCliente(@RequestBody ClienteDto cliente){
		try {
			this.clienteService.save(cliente);
			new ResponseEntity<String>(HttpStatus.OK);
			return ResponseEntity.ok("Se creo el cliente");
		}catch (Exception e) {
			new ResponseEntity<String>(HttpStatus.BAD_REQUEST);
			return ResponseEntity.ok("Error al crear el cliente");
		}
		
	}
}
