package com.uece.boleto.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uece.boleto.domain.BoletoEntity;
import com.uece.boleto.domain.BoletoRespository;
import com.uece.boleto.model.BoletoDTO;

@Service
public class BoletoService {

	@Autowired(required = true)
	private BoletoRespository boletoRepository;

	public BoletoEntity porId(Integer id) {
		BoletoEntity boleto = boletoRepository.findById(id).get();
		if (boleto != null) {
			return boleto;
		} else {
			throw new IllegalArgumentException("boletos com id : " + id + " não existe");
		}
	}

	public List<BoletoDTO> listar(Integer idcliente) {
		List<BoletoDTO> boletos = (List<BoletoDTO>) boletoRepository.findAllByIdCliente();
		return boletos;
	}

	public BoletoEntity inserir(BoletoDTO boleto) {
	
			return  boletoRepository.save(boleto.coverterEntity());
	}

}
