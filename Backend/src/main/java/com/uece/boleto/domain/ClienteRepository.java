package com.uece.boleto.domain;

import java.util.*;

import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<ClienteEntity, Integer> {
  List<ClienteEntity> findAll();
  Optional<ClienteEntity> findById(Integer id);
  void deleteById(Integer id);
  ClienteEntity save(ClienteEntity cliente);
 
}