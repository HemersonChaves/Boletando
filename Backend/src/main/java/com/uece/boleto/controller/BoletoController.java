package com.uece.boleto.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
// import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("clientes/{idcliente}/boletos")
public class BoletoController {
  
  /* @GetMapping
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
  } */
  @GetMapping()
  public String getBoleto(@PathVariable String idcliente) {
    return "lista todos boletos do idcliente =  " + idcliente;
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
