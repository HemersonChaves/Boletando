package com.uece.boleto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.*;
import org.springframework.web.bind.annotation.*;

import com.uece.boleto.domain.BoletoEntity;
import com.uece.boleto.model.BoletoDTO;
import com.uece.boleto.service.BoletoService;

@RestController
@RequestMapping("clientes/{idcliente}/boletos")
public class BoletoController {
  @Autowired(required = true)
  private BoletoService boletoService;
  @PostMapping()
  public ResponseEntity<BoletoEntity> adicionaIdBoleto(@PathVariable("idcliente") Integer idcliente, @RequestBody BoletoDTO boleto) {
  
    boleto.setidCliente(1);
    
    BoletoEntity boletosalvo = boletoService.inserir(boleto);
    return ResponseEntity
        .status(HttpStatus.CREATED)
        // .body(boletoService.inserir(boleto));
        .body(boletosalvo);
  }

  @GetMapping()
  public ResponseEntity<List<BoletoDTO>> getBoleto(@PathVariable("idcliente") Integer idcliente) {
   
   
    return ResponseEntity.status(HttpStatus.CREATED)
        .body(boletoService.listar(idcliente));
  }


  @GetMapping("/{idboleto}")
  public String getIdBoleto(@PathVariable("idcliente") String idcliente, @PathVariable("idboleto") String idboleto) {
    return "idcleinte  = " + idcliente + " id boleto = "+ idboleto;
  }
  @PostMapping("/{idboleto}")
  public String adicionaIdBoleto(@PathVariable("idcliente") String idcliente, @PathVariable("idboleto") String idboleto) {
    return " post idcleinte  = " + idcliente + " id boleto = "+ idboleto;
  }
  @PatchMapping("/{idboleto}")
  public String atualizaIdBoleto(@PathVariable("idcliente") String idcliente, @PathVariable("idboleto") String idboleto) {
    return "patch idcleinte  = " + idcliente + " id boleto = "+ idboleto;
  }
  @DeleteMapping("/{idboleto}")
  public String removeIdBoleto(@PathVariable("idcliente") String idcliente, @PathVariable("idboleto") String idboleto) {
    return "delete idcleinte  = " + idcliente + " id boleto = "+ idboleto;
  }
}
