package com.uece.boleto.domain;

import java.util.*;

import org.springframework.data.repository.CrudRepository;

public interface BoletoRespository extends CrudRepository<BoletoEntity, Integer> {

  List<BoletoEntity> findAll();

  Optional<BoletoEntity> findById(Integer id);

  void deleteById(Integer id);

  BoletoEntity save(BoletoEntity cliente);
}
