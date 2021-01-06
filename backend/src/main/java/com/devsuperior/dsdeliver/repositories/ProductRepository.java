package com.devsuperior.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.devsuperior.dsdeliver.entities.Product;

public interface ProductRepository extends JpaRepository<Product, Long> {
	/*JpaRepository - traz implementações padrão para buscar/salvar/deletar dados*/
	
	List<Product> findAllByOrderByNameAsc();

}
