package com.angelcode.appserviceclientesproductos.repository;

import java.util.List;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.angelcode.appserviceclientesproductos.entity.ClienteEntity;

public interface ClienteRepository extends JpaRepository<ClienteEntity,Integer> {

	public Optional<ClienteEntity> findById(Integer id);
	public List<ClienteEntity> findAll();
}
