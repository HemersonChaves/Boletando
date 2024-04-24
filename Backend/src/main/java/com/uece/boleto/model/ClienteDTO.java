package com.uece.boleto.model;

import com.uece.boleto.domain.ClienteEntity;

public class ClienteDTO {

  private Integer id;
  private String nome;
  private String senha;

  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getSenha() {
    return senha;
  }

  public void setSenha(String senha) {
    this.senha = senha;
  }

  // Convert UserDto into User JPA Entity
  public static ClienteEntity coverterDTO(ClienteDTO clientedto) {
    ClienteEntity cliente = new ClienteEntity(
        clientedto.getId(),
        clientedto.getNome(),
        clientedto.getSenha());
    return cliente;
  }

}