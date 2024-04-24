package com.uece.boleto.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.uece.boleto.domain.ClienteEntity;
import com.uece.boleto.model.ClienteDTO;
import com.uece.boleto.service.ClienteService;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

  @Autowired(required = true)
  private ClienteService clienteService;

  @GetMapping()
  public ResponseEntity<List<ClienteEntity>> getCliente() {
    return ResponseEntity.status(HttpStatus.CREATED)
        .body(clienteService.listar());
  }

  @GetMapping("/{id}")
  public ResponseEntity getIdCliente(@PathVariable Integer id) {
    ClienteEntity cliente = clienteService.porId(id);
    System.out.println(cliente.toString());
    if (cliente == null) {
      return ResponseEntity.notFound().build();
    } else {
      return ResponseEntity.ok(cliente);
    }
  }

  @PostMapping()
  public ResponseEntity<ClienteEntity> adicionaCliente(@RequestBody ClienteDTO cliente) {

   
    return ResponseEntity
        .status(HttpStatus.CREATED)
        .body(clienteService.inserir(cliente));
  }
}