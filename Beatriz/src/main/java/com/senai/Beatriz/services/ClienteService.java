package com.senai.Beatriz.services;

import java.util.List;

import org.springframework.stereotype.Service;

import com.senai.Beatriz.entities.Cliente;
import com.senai.Beatriz.repositories.ClienteRepository;

@Service
public class ClienteService {
	private final ClienteRepository clienteRepository;
	
	public ClienteService (ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}

	public Cliente saveCliente (Cliente cliente) {
		return clienteRepository.save(cliente);
	}
	
	public Cliente getClienteById (Long idcCliente) {
		return clienteRepository.findById(idcCliente).orElse(null);
	}
		
	public List<Cliente> getAllCliente () {
		return clienteRepository.findAll ();
	}
	
	public void deleteCliente (Long idcCliente) {
		clienteRepository.deleteById(idcCliente);
	}
}
