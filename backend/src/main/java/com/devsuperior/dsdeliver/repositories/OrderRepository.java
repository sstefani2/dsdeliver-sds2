package com.devsuperior.dsdeliver.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	/*JpaRepository - traz implementações padrão para buscar/salvar/deletar dados*/
	
	

}
