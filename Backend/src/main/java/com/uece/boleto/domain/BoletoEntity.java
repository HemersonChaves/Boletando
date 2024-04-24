package com.uece.boleto.domain;

import java.io.Serializable;
import java.time.LocalDate;
import java.util.*;

import jakarta.persistence.*;

@Entity
@Table(name = "boleto")
public class BoletoEntity implements Serializable {
  public BoletoEntity() {
  }

  public BoletoEntity(
      Integer id,
      Integer idcliente,
      String titulo,
      String banco,
      LocalDate dtvencimento,
      LocalDate dtpagamento,
      boolean status,
      double valor,
      float juros

  ) {
    this.id = id;

    ClienteEntity cliente = new ClienteEntity();
    this.cliente = cliente;    
    this.cliente.setId(idcliente);

    this.titulo = titulo;
    this.banco = banco;
    this.dtvencimento = dtvencimento;
    this.dtpagamento = dtpagamento;
    this.status = status;
    this.valor = valor;
    this.juros = juros;
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Integer id;

  @ManyToOne(fetch = FetchType.LAZY)
  @JoinColumn(name = "idcliente", nullable = false)
  private ClienteEntity cliente;

  @Column(name = "titulo", nullable = false)
  private String titulo;

  @Column(name = "banco", nullable = false)
  private String banco;

  @Column(name = "dtvencimento", nullable = false)
  private LocalDate dtvencimento;

  @Column(name = "dtpagamento", nullable = false)
  private LocalDate dtpagamento;

  @Column(name = "status", nullable = false)
  private boolean status;

  @Column(name = "valor", nullable = false)
  private double valor;

  @Column(name = "juros", nullable = false)
  private float juros;

  private List<BoletoEntity> boletos = new ArrayList<>();

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setBanco(String banco) {
    this.banco = banco;
  }

  public void setDtvencimento(LocalDate dtvencimento) {
    this.dtvencimento = dtvencimento;
  }

  public void setDtpagamento(LocalDate pagamento) {
    this.dtpagamento = dtpagamento;
  }

  public void setStatus(boolean status) {
    this.status = status;
  }

  public void setValor(double valor) {
    this.valor = valor;
  }

  public void setJuros(float juros) {
    this.juros = juros;
  }

  public void setBoletos(List<BoletoEntity> transactions) {
    this.boletos = transactions;
  }

  public List<BoletoEntity> getBoletos() {
    return boletos;
  }

  public ClienteEntity getCliente() {
    return cliente;
  }

  public Integer getIdCliente() {
    return cliente.getId();
  }

  public void setCliente(ClienteEntity cliente) {
    this.cliente = cliente;
  }

  public void setIdCliente(Integer idcliente) {
    this.cliente.setId(idcliente);
  }

  public String getTitulo() {
    return this.titulo;
  }

  public String getBanco() {
    return this.banco;
  }

  public LocalDate getDtvencimento() {
    return this.dtvencimento;
  }

  public LocalDate getDtpagamento() {
    return this.dtpagamento;
  }

  public boolean getStatus() {
    return this.status;
  }

  public double getValor() {
    return this.valor;
  }

  public float getJuros() {
    return this.juros;
  }

  @Override
  public String toString() {
    return "Boleto{ "+
      "Integer " + id +","+
      "Integer "+ cliente.getId() +","+
      "String " +titulo +","+
      "String " +banco +","+
      "LocalDate "+ dtvencimento +","+
      "LocalDate "+ dtpagamento +","+
      "boolean " + status +","+
      "double " +valor +","+
      "float " + juros +
    

        '}';
  }
}
