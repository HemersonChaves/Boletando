package com.uece.boleto.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uece.boleto.domain.ClienteEntity;
import com.uece.boleto.domain.ClienteRepository;
import com.uece.boleto.model.ClienteDTO;

@Service
public class ClienteService {
	@Autowired(required=true)
  private ClienteRepository clienteRepository;
  
  public ClienteEntity porId(Integer id) {
		ClienteEntity cliente = clienteRepository.findById(id).get();
		if (cliente != null) {
			return cliente;
		} else {
			throw new IllegalArgumentException("Usuário com id : " + id + " não existe");
		}
	}
	public List<ClienteEntity> listar() {
		List<ClienteEntity> clientes = (List<ClienteEntity>) clienteRepository.findAll();
		return clientes;
	}
	public ClienteEntity inserir(ClienteDTO cliente) {
										
		return clienteRepository.save(cliente.coverterDTO(cliente));
	}
}
