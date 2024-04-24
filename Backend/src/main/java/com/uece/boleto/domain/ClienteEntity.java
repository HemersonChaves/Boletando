package com.uece.boleto.domain;

import java.util.List;

import jakarta.persistence.*;

@Entity
@Table(name = "cliente")
public class ClienteEntity {
  public ClienteEntity(){}
  public ClienteEntity(Integer id, String nome, String senha) {
    this.nome = nome;
    this.id = id;
    this.senha = senha;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @OneToMany(fetch = FetchType.LAZY, mappedBy = "id")
  private List<BoletoEntity> boleto;

  @Column(name = "nome", nullable = false)

  private String nome;

  @Column(name = "senha", nullable = false)
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

  @Override
  public String toString() {
    return "Cliente{" +
        "id=" + id +
        ", nome=" + nome +
        ", senha=" + senha +
        '}';
  }
}
