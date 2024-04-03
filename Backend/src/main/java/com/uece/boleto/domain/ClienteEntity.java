package com.uece.boleto.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "cliente")
public class ClienteEntity {
  public ClienteEntity(){}
  public ClienteEntity(Long id, String nome, String senha) {
    this.nome = nome;
    this.id = id;
    this.senha = senha;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "nome", nullable = false)
  private String nome;

  @Column(name = "senha", nullable = false)
  private String senha;

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
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

  @Override
  public String toString() {
    return "Cliente{" +
        "id=" + id +
        ", nome=" + nome +
        ", senha=" + senha +
        '}';
  }
}
