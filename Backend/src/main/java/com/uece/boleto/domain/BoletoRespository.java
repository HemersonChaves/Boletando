package com.uece.boleto.domain;

import java.util.*;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.uece.boleto.model.BoletoDTO;


public interface BoletoRespository extends  JpaRepository<BoletoEntity, Integer> {

  
  @Query( value = "SELECT b.id, banco, boletos, dtpagamento, dtvencimento, juros, status, titulo, valor, idcliente FROM Boleto b INNER JOIN Cliente c ON b.idcliente = c.id WHERE b.idcliente = 1",  nativeQuery = true)
  List<BoletoDTO> findAllByIdCliente();
  // List<BoletoEntity> findAllByIdCliente(@Param("idcliente") Integer idcliente);

  Optional<BoletoEntity> findById(Integer id);

  void deleteById(Integer id);

  BoletoEntity save(BoletoEntity cliente);
}
