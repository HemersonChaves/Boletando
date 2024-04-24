package com.uece.boleto.model;

import java.time.LocalDate;
import java.util.*;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.uece.boleto.domain.BoletoEntity;

public class BoletoDTO {
  private Integer id;
  private Integer idcliente;
  private String titulo;
  private String banco;
  private LocalDate dtvencimento;
  private LocalDate dtpagamento;
  private boolean status;
  private double valor;
  private float juros;
  // private List<BoletoEntity> boletos = new ArrayList<>();

  public void setId(Integer id) {
    this.id = id;
  }

  public void setTitulo(String titulo) {
    this.titulo = titulo;
  }

  public void setBanco(String banco) {
    this.banco = banco;
  }

  public void setDtvencimento(LocalDate dtvencimento) {
    this.dtvencimento = dtvencimento;
  }

  public void setDtpagamento(LocalDate dtpagamento) {
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

  // public void setBoletos(List<BoletoEntity> transactions) {
  // this.boletos = transactions;
  // }

  // public List<BoletoEntity> getBoletos() {
  // return boletos;
  // }

  public Integer getId() {
    return id;
  }

  public Integer getidCliente() {
    return idcliente;
  }

  public void setidCliente(Integer idcliente) {
    this.idcliente = idcliente;
  }

  public String getTitulo() {
    return this.titulo;
  }

  public String getBanco() {
    return this.banco;
  }

  @JsonFormat(pattern = "dd/MM/yyyy")
  public LocalDate getDtvencimento() {
    return this.dtvencimento;
  }

  @JsonFormat(pattern = "dd/MM/yyyy")
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

  // Convert UserDto into User JPA Entity
  public BoletoEntity coverterEntity() {
    BoletoEntity boleto = new BoletoEntity(

        id,
        idcliente,
        titulo,
        banco,
        dtvencimento,
        dtpagamento,
        status,
        valor,
        juros);

    return boleto;
  }
}
