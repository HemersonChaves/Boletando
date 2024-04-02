package com.uece.boleto.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/clientes")
public class ClienteController {
  
  @GetMapping
   public String getCliente() {
    return "lista todos os";
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