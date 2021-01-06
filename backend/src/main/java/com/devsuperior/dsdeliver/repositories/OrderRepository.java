package com.devsuperior.dsdeliver.repositories;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.devsuperior.dsdeliver.entities.Order;

public interface OrderRepository extends JpaRepository<Order, Long> {
	/*JpaRepository - traz implementações padrão para buscar/salvar/deletar dados*/
	
	/*consulta é realizada em JPQL, sintaxe própria da JPA, semelhante ao SQL
	 * no FROM utilizar o nome exato da classe, respeitando charcase*/
	@Query("SELECT DISTINCT obj FROM Order obj JOIN FETCH obj.products "
			+ " WHERE obj.status = 0 ORDER BY obj.moment ASC")
	List<Order> findOrdersWithProducts();


}
