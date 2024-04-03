package com.uece.boleto.domain;

import org.springframework.data.repository.CrudRepository;

public interface ClienteRepository extends CrudRepository<ClienteEntity, Integer> {

  ClienteEntity buscaID(Integer id);
}
