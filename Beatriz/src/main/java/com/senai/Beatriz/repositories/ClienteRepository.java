package com.senai.Beatriz.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.senai.Beatriz.entities.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long>{

}
