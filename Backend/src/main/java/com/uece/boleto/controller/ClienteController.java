package com.uece.boleto.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {

  @GetMapping
  public ResponseEntity<Object> getCliente() {
    Map<String, String> data = new HashMap<>();
    data.put("id", "142");
    data.put("nome", "João");
    data.put("senha", "qwerty");
    return new ResponseEntity<>(data, HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public String getIdCliente(@PathVariable String id) {
    return "id = " + id;
  }

  @PostMapping("/{id}")
  public String adicionaIdCliente(@PathVariable String id) {
    return "post id = " + id;
  }
}